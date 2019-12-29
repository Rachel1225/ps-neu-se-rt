package com.ps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 * 诱导源类型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaType implements Serializable {

    @Id
    private Integer mediaTypeId;

    private String mediaTypeName;

    private static final long serialVersionUID = 1L;
}