package com.ps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * 武警病例表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicalCase implements Serializable {

    @Id
    private String medicalCaseId;

    private Integer hypertension;

    private Integer heartDisease;

    private Integer epilepsy;

    private Integer diabetesMellitus;

    private String policeId;

    private Date time;

    private static final long serialVersionUID = 1L;
}