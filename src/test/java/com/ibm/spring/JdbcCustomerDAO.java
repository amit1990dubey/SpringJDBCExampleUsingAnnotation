package com.ibm.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


//Spring Repository annotation is a specialization of @Component annotation, so Spring Repository classes are autodetected
// by spring framework through classpath scanning.Spring Repository is very close to DAO pattern where DAO classes are
// responsible for providing CRUD operations on database tables. However, if you are using Spring Data for managing database
// operations, then you should use Spring Data Repository interface.

@Repository("cdao")
public class JdbcCustomerDAO implements CustomerDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;


    public void addCustomer(CustomerTO cto) {

        String sql = "insert into customers values(?,?,?,?,?)";
        jdbcTemplate.update(sql,cto.getCid(), cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());

    }

    public void updateCustomer(CustomerTO cto) {

        String sql ="update customers set cname=?, email=?,phone=?, city =? where cid=?";
        jdbcTemplate.update(sql,cto.getCname(),cto.getEmail(),cto.getCity(),cto.getPhone(),cto.getCid());

    }

    public void deleteCustomer(int cid) {

        String sql = "delete from customers where cid =?";
        jdbcTemplate.update(sql,cid);

    }
}
