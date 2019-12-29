package com.ps.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 *是否有疾病--例如1 有疾病，0没有疾病
 * 数据字典
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "has_disease")
public class HasDisease implements Serializable {

    @Id
    @Column(name = "HAS_DISEASE_ID")
    private Integer hasDiseaseId;
    @Column(name = "HAS_DISEASE_DESCRIPTION")
    private String hasDiseaseDescription;

    private static final long serialVersionUID = 1L;
}