package com.ps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * 测试发布表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test implements Serializable {

    @Id
    private String testId;

    private Integer testType;

    private Date time;

    private static final long serialVersionUID = 1L;
}