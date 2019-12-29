package com.ps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 * 性别指代，例如0指代女，1指代男
 * 数据字典
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sex implements Serializable {

    @Id
    private Integer sexId;

    private String sexDescription;

    private static final long serialVersionUID = 1L;
}