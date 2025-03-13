package com.giant.kitchen.infra.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 菜肴分类(DishCategory)实体类
 *
 * @author makejava
 * @since 2025-03-13 14:00:36
 */
@Data
public class DishCategory implements Serializable {
    private static final long serialVersionUID = -30020760131002485L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 分类名
     */
    private String categoryName;
    /**
     * 分类类型
     */
    private Integer categoryType;
    /**
     * 排序权重
     */
    private Integer categorySort;
    /**
     * 状态
     */
    private Integer status;
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

