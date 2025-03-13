package com.giant.kitchen.infra.service.impl;

import com.giant.kitchen.infra.entity.DishSpec;
import com.giant.kitchen.infra.mapper.DishSpecDao;
import com.giant.kitchen.infra.service.DishSpecService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 菜品规格(DishSpec)表服务实现类
 *
 * @author makejava
 * @since 2025-03-13 14:02:25
 */
@Service("dishSpecService")
public class DishSpecServiceImpl implements DishSpecService {
    @Resource
    private DishSpecDao dishSpecDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DishSpec queryById(Integer id) {
        return this.dishSpecDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param dishSpec    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<DishSpec> queryByPage(DishSpec dishSpec, PageRequest pageRequest) {
        long total = this.dishSpecDao.count(dishSpec);
        return new PageImpl<>(this.dishSpecDao.queryAllByLimit(dishSpec, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param dishSpec 实例对象
     * @return 实例对象
     */
    @Override
    public DishSpec insert(DishSpec dishSpec) {
        this.dishSpecDao.insert(dishSpec);
        return dishSpec;
    }

    /**
     * 修改数据
     *
     * @param dishSpec 实例对象
     * @return 实例对象
     */
    @Override
    public DishSpec update(DishSpec dishSpec) {
        this.dishSpecDao.update(dishSpec);
        return this.queryById(dishSpec.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dishSpecDao.deleteById(id) > 0;
    }
}
