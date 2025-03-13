package com.giant.kitchen.infra.mapper;

import com.giant.kitchen.infra.entity.DishSpec;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 菜品规格(DishSpec)表数据库访问层
 *
 * @author makejava
 * @since 2025-03-13 14:02:25
 */
public interface DishSpecDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DishSpec queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param dishSpec 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<DishSpec> queryAllByLimit(DishSpec dishSpec, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param dishSpec 查询条件
     * @return 总行数
     */
    long count(DishSpec dishSpec);

    /**
     * 新增数据
     *
     * @param dishSpec 实例对象
     * @return 影响行数
     */
    int insert(DishSpec dishSpec);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<DishSpec> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<DishSpec> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<DishSpec> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<DishSpec> entities);

    /**
     * 修改数据
     *
     * @param dishSpec 实例对象
     * @return 影响行数
     */
    int update(DishSpec dishSpec);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

