package com.giant.kitchen.infra.service.impl;

import com.giant.kitchen.infra.entity.DishInfo;
import com.giant.kitchen.infra.mapper.DishInfoDao;
import com.giant.kitchen.infra.service.DishInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 菜肴信息(DishInfo)表服务实现类
 *
 * @author makejava
 * @since 2025-03-13 13:48:28
 */
@Service("dishInfoService")
public class DishInfoServiceImpl implements DishInfoService {
    @Resource
    private DishInfoDao dishInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public DishInfo queryById(Integer id) {
        return this.dishInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param dishInfo    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<DishInfo> queryByPage(DishInfo dishInfo, PageRequest pageRequest) {
        long total = this.dishInfoDao.count(dishInfo);
        return new PageImpl<>(this.dishInfoDao.queryAllByLimit(dishInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param dishInfo 实例对象
     * @return 实例对象
     */
    @Override
    public DishInfo insert(DishInfo dishInfo) {
        this.dishInfoDao.insert(dishInfo);
        return dishInfo;
    }

    /**
     * 修改数据
     *
     * @param dishInfo 实例对象
     * @return 实例对象
     */
    @Override
    public DishInfo update(DishInfo dishInfo) {
        this.dishInfoDao.update(dishInfo);
        return this.queryById(dishInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.dishInfoDao.deleteById(id) > 0;
    }
}
