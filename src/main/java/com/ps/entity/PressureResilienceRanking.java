package com.ps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 * 压力指数分级
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PressureResilienceRanking implements Serializable {

    @Id
    private Integer pressureResilienceRankingId;

    private String policeId;

    private String pressureResilienceRanking;

    private static final long serialVersionUID = 1L;
}