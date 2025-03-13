package com.giant.kitchen.infra.service;

import com.giant.kitchen.infra.entity.DishCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 菜肴分类(DishCategory)表服务接口
 *
 * @author makejava
 * @since 2025-03-13 14:00:36
 */
public interface DishCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DishCategory queryById(Integer id);

    /**
     * 分页查询
     *
     * @param dishCategory 筛选条件
     * @param pageRequest  分页对象
     * @return 查询结果
     */
    Page<DishCategory> queryByPage(DishCategory dishCategory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param dishCategory 实例对象
     * @return 实例对象
     */
    DishCategory insert(DishCategory dishCategory);

    /**
     * 修改数据
     *
     * @param dishCategory 实例对象
     * @return 实例对象
     */
    DishCategory update(DishCategory dishCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
