package com.giant.kitchen.infra.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 菜肴信息(DishInfo)实体类
 *
 * @author makejava
 * @since 2025-03-13 13:48:28
 */
@Data
public class DishInfo implements Serializable {
    private static final long serialVersionUID = -93573602171129505L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 分类ID
     */
    private Integer categoryId;
    /**
     * 菜肴名臣
     */
    private String dishName;
    /**
     * 图片链接
     */
    private String imageUrl;
    /**
     * 销量
     */
    private Integer sales;
    /**
     * 好评率
     */
    private Double praiseRate;
    /**
     * 菜肴描述
     */
    private String description;
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

