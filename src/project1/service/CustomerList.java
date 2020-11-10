package project1.service;

import project1.bean.Customer;

/**
 * CustomerList为Customer对象的管理模块
 * 并提供相应的增删改查
 * 供CustomerView调用
 */
public class CustomerList {
    private Customer[] customers;//保存客户的对象的数组
    private  int total = 0;//保存客户对象的数量
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){
        if (total>=customers.length){
            return false;
        }
        customers[total++]=customer;
        return true;
    }
    public boolean replace(int index , Customer cust){
        if (index<0||index>=total){
            return false;
        }
        customers[index]=cust;
        return true;
    }
    public boolean deleteCustomer(int index){
        if (index<0||index>=total){
            return false;
        }
        for (int i = index;i<total-1;i++){
            customers[i]=customers[i+1];
        }
        customers[--total]=null;
        return true;
    }
    public Customer[] getAllCustomer(){
        Customer[] custs = new Customer[total];
        for (int i = 0 ; i<total; i++){
            custs[i] = customers[i];
        }
        return custs;
    }
    public Customer getCustomer(int index){
        if (index<0||index>=total){
            return null;
        }
        return customers[index];

    }
    public int getTotal(){
        return total;
    }




}
