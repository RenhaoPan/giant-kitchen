package com.giant.kitchen.infra.mapper;

import com.giant.kitchen.infra.entity.DishCategory;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 菜肴分类(DishCategory)表数据库访问层
 *
 * @author makejava
 * @since 2025-03-13 14:00:35
 */
public interface DishCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DishCategory queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param dishCategory 查询条件
     * @param pageable     分页对象
     * @return 对象列表
     */
    List<DishCategory> queryAllByLimit(DishCategory dishCategory, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param dishCategory 查询条件
     * @return 总行数
     */
    long count(DishCategory dishCategory);

    /**
     * 新增数据
     *
     * @param dishCategory 实例对象
     * @return 影响行数
     */
    int insert(DishCategory dishCategory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DishCategory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DishCategory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DishCategory> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<DishCategory> entities);

    /**
     * 修改数据
     *
     * @param dishCategory 实例对象
     * @return 影响行数
     */
    int update(DishCategory dishCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

