package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab57 {

    public static void main(String[] args) {


        ApplicationContext ctx = new AnnotationConfigApplicationContext(IBMConfig.class);
        CustomerDAO cdao = (CustomerDAO)ctx.getBean("cdao");


        //1. addCustomer

        CustomerTO cto = new CustomerTO(461,"amit dubey","amit@ibm.com",56576574,"Bangalore");
        cdao.addCustomer(cto);

        //2. UpdateCustomer

        CustomerTO cto1 = new CustomerTO(462,"rupa","r@gmail.com",6764463,"TRV");
        cdao.addCustomer(cto1);

        //3. deleteCustomer
        cdao.deleteCustomer(6789);
        System.out.println("Check your DataBase");
    }
}
