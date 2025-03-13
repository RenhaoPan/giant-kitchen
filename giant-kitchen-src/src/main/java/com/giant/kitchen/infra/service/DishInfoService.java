package com.giant.kitchen.infra.service;

import com.giant.kitchen.infra.entity.DishInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * 菜肴信息(DishInfo)表服务接口
 *
 * @author makejava
 * @since 2025-03-13 13:48:28
 */
public interface DishInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DishInfo queryById(Integer id);

    /**
     * 分页查询
     *
     * @param dishInfo    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<DishInfo> queryByPage(DishInfo dishInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param dishInfo 实例对象
     * @return 实例对象
     */
    DishInfo insert(DishInfo dishInfo);

    /**
     * 修改数据
     *
     * @param dishInfo 实例对象
     * @return 实例对象
     */
    DishInfo update(DishInfo dishInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
