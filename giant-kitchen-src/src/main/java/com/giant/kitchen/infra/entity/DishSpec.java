package com.giant.kitchen.infra.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 菜品规格(DishSpec)实体类
 *
 * @author makejava
 * @since 2025-03-13 14:02:25
 */
@Data
public class DishSpec implements Serializable {
    private static final long serialVersionUID = -51117324099033032L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 菜肴id
     */
    private Integer dishId;
    /**
     * 规格名称;如“辣度”
     */
    private String specName;
    /**
     * 规格选项
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String specOptions;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    private Date updatedTime;

}

