package com.ibm.spring;

public interface CustomerDAO {

    public void addCustomer(CustomerTO cto);

    public void updateCustomer(CustomerTO cto);

    public void deleteCustomer(int cid);
}
