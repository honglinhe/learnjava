package Project3.service;

import Project3.domain.*;

import static Project3.service.Data.*;

/**
 * 负责将Data中的数据封装到Employee[]数组中，
 * 同时提供相关的操作Employee[]的方法
 */
public class NameListService {


    private Employee[] employees;

    /**
     * employees及数组元素的初始化
     */
    public NameListService() {
        //1.根据项目提供的Data类构建相应大小的employees:数组
        //2.再根据Data类中的数据构建不同的对象,包括 Employee、 Programmer、 Designer和 Architect
        //3.将对象存于数组中
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            int salary = Integer.parseInt(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = createquipment(i);
                    employees[i] = new Programmer(equipment, id, name, age, salary);
                    break;
                case DESIGNER:
                    equipment = createquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(equipment, id, name, age, salary, bonus);
                    break;
                case ARCHITECT:
                    equipment = createquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(equipment, id, name, age, salary, bonus, stock);
                    break;

            }


        }


    }


    public Equipment createquipment(int i) {
        int type = Integer.parseInt(EQUIPMENTS[i][0]);
        switch (type) {
            case PC:
                return new PC(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
            case NOTEBOOK:
                return new NoteBook(EQUIPMENTS[i][1], Double.parseDouble(EQUIPMENTS[i][2]));

            case PRINTER:
                return new Printer(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
        }
        return null;
    }

    /**
     * 获取全部员工的信息
     * @return
     */
    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     *
     * @param 获取指定id员工的对象
     * @return
     * @throws TeamException
     */
    public Employee getEmployees(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }


}
