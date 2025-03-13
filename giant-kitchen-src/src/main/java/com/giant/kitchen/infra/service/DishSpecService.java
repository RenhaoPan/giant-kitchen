package com.giant.kitchen.infra.service;

import com.giant.kitchen.infra.entity.DishSpec;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 菜品规格(DishSpec)表服务接口
 *
 * @author makejava
 * @since 2025-03-13 14:02:25
 */
public interface DishSpecService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DishSpec queryById(Integer id);

    /**
     * 分页查询
     *
     * @param dishSpec    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<DishSpec> queryByPage(DishSpec dishSpec, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param dishSpec 实例对象
     * @return 实例对象
     */
    DishSpec insert(DishSpec dishSpec);

    /**
     * 修改数据
     *
     * @param dishSpec 实例对象
     * @return 实例对象
     */
    DishSpec update(DishSpec dishSpec);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
