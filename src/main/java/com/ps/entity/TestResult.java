package com.ps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * 测试结果
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestResult implements Serializable {

    @Id
    private String testResultId;

    private String testId;

    private String testerName;

    private String voiceResult;

    private String physicalResult;

    private String eegResult;

    private String result;

    private Date time;

    private String disease;

    private String physiology;

    private static final long serialVersionUID = 1L;
}