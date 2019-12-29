package com.ps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * 武警静态生理指数表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaticPhysiology implements Serializable {

    @Id
    private String physiologyId;

    private String policeId;

    private Integer bloodPressure;

    private Integer pulse;

    private Integer heartbeat;

    private Date time;

    private static final long serialVersionUID = 1L;
}