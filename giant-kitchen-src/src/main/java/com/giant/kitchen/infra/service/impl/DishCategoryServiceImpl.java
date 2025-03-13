package com.giant.kitchen.infra.service.impl;

import com.giant.kitchen.infra.entity.DishCategory;
import com.giant.kitchen.infra.mapper.DishCategoryDao;
import com.giant.kitchen.infra.service.DishCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 菜肴分类(DishCategory)表服务实现类
 *
 * @author makejava
 * @since 2025-03-13 14:00:36
 */
@Service("dishCategoryService")
public class DishCategoryServiceImpl implements DishCategoryService {
    @Resource
    private DishCategoryDao dishCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DishCategory queryById(Integer id) {
        return this.dishCategoryDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param dishCategory 筛选条件
     * @param pageRequest  分页对象
     * @return 查询结果
     */
    @Override
    public Page<DishCategory> queryByPage(DishCategory dishCategory, PageRequest pageRequest) {
        long total = this.dishCategoryDao.count(dishCategory);
        return new PageImpl<>(this.dishCategoryDao.queryAllByLimit(dishCategory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param dishCategory 实例对象
     * @return 实例对象
     */
    @Override
    public DishCategory insert(DishCategory dishCategory) {
        this.dishCategoryDao.insert(dishCategory);
        return dishCategory;
    }

    /**
     * 修改数据
     *
     * @param dishCategory 实例对象
     * @return 实例对象
     */
    @Override
    public DishCategory update(DishCategory dishCategory) {
        this.dishCategoryDao.update(dishCategory);
        return this.queryById(dishCategory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dishCategoryDao.deleteById(id) > 0;
    }
}
