package com.ps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * 武警基本信息表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PoliceData implements Serializable {

    @Id
    private String policeId;

    private String policeName;

    private Integer policeAge;

    private Integer policeSex;

    private String policeCategory;

    private static final long serialVersionUID = 1L;
}