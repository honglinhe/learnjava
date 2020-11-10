package project1.ui;

import project1.bean.Customer;
import project1.service.CustomerList;
import project1.util.CMUtility;

/**
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("aaa", '男', 23, "131432", "432234");
        customerList.addCustomer(customer);
    }

    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("---------------");
            System.out.println("1添加");
            System.out.println("2修改");
            System.out.println("3删除");
            System.out.println("4list");
            System.out.println("5 退出");
            System.out.println("请输入（1-5）：");
            char meun = CMUtility.readMenuSelection();
            switch (meun) {
                case '1':
                    add();
                    break;
                case '2':
                    modify();
                    break;
                case '3':
                    delete();
                    break;
                case '4':
                    list();
                    break;
                case '5':
                    System.out.println("y/n");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;

                    }

            }


        }

    }

    private void add() {
//        System.out.println("zengjia");
        System.out.println("-----------------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别");
        char gender = CMUtility.readChar();
        System.out.print("年龄");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(13);
        System.out.print("youxiang ");
        String email = CMUtility.readString(30);
        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSucces = customerList.addCustomer(customer);
        if (isSucces) {
            System.out.println("tianjianwancheng");
        } else {
            System.out.println("XXXXXX");
        }


        System.out.println("-----------------------------");


    }


    private void modify() {
//        System.out.println("tiaozheng");
        System.out.println("************************");
        int n;
        Customer cust;

        for (; ; ) {
            System.out.println("请选择待修改的客户编号（-1退出）");
            n = CMUtility.readInt();
            if (n == -1) {
                return;
            }
            cust = customerList.getCustomer(n - 1);
            if (cust == null) {
                System.out.println("没有找到客户");
            } else {//找到客户
                break;
            }

        }
        System.out.println("姓名（" + cust.getName() + ")");
        String name = CMUtility.readString(10, cust.getName());
        System.out.println("省略");
        Customer newCust = new Customer(name, '1', 10, "32131", "312312");
        boolean isReplace = customerList.replace(n - 1, newCust);
        if (isReplace) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }


        System.out.println("************************");
    }

    private void delete() {
//        System.out.println("shanchu");
        int n;
        for (; ; ) {
            System.out.println("请选择待删除的客户编号（-1退出）");
            n = CMUtility.readInt();
            if (n == -1) {
//                System.out.println("");
                return;
            }
            Customer customer = customerList.getCustomer(n - 1);
            if (customer == null) {
                System.out.println("无法找到指定的用户");
            } else {
                break;
            }
        }
        System.out.println("Y/N:");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean isSuccess = customerList.deleteCustomer(n - 1);
            if (isSuccess) {
                System.out.println("---成功");
            } else {
                System.out.println("失败");
            }
        }else{
                return;
            }


        }

        private void list () {
//        System.out.println("list");
            System.out.println("-----------------------------");
            int total = customerList.getTotal();
            if (total == 0) {
                System.out.println("没有客户记录");
            } else {
                System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱\t");
                Customer[] custs = customerList.getAllCustomer();
                for (int i = 0; i < custs.length; i++) {
                    Customer cust = custs[i];
                    System.out.println(
                            (i + 1) + '\t' + cust.getName() +
                                    '\t' + cust.getGender()
                                    + '\t' + cust.getAge() +
                                    '\t' + cust.getPhone()
                                    + '\t' + cust.getEmail()
                    );
                }
            }
            System.out.println("-----------------------------");

        }

        public static void main (String[]args){
            CustomerView view = new CustomerView();
            view.enterMainMenu();
        }

    }
