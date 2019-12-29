package com.ps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 *
 *诱导源表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaData implements Serializable {

    @Id
    private String mediaId;

    private String mediaName;

    private Integer mediaType;

    private String mediaPath;

    private Date uploadTime;

    private static final long serialVersionUID = 1L;
}