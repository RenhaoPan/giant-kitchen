package com.giant.kitchen.common.util;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCTest {
    // 手动连接测试代码
    public static void main(String[] args)throws SQLException {


        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); // 双重保险
        ds.setUrl("jdbc:mysql://8.133.196.106:3306/giant-kitchen?useSSL=false");
        ds.setUsername("admin");
        ds.setPassword("panrenhao");
        try (Connection conn = ds.getConnection()) {
            System.out.println("手动连接成功！");
        }
    }
}
