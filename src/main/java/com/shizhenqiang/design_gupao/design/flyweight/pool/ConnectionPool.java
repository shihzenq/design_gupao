package com.shizhenqiang.design_gupao.design.flyweight.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 通过享元设计模式来模式连接池实现
 */
public class ConnectionPool {

    private List<Connection> pool = new ArrayList<>();

    private String url = "jdbc:mysql://localhost:3306/sys";

    private String username = "root";

    private String password = "root123";

    private int poolSize = 500;

    private String driverClassName = "com.mysql.jdbc.Driver";

    public ConnectionPool() {
        try {
            Class.forName(driverClassName);
            for (int i =0; i < poolSize; i++) {
                Connection connection = DriverManager.getConnection(url, username, password);
                pool.add(connection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized Connection getConnection() {
        Connection connection = pool.get(0);
        pool.remove(connection);
        return connection;
    }

    public synchronized void release(Connection connection){
        pool.add(connection);
    }

}
