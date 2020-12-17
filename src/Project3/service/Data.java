package Project3.service;

public class Data {
    public static final int EMPLOYEE = 10;
    public static final int PROGRAMMER = 11;
    public static final int DESIGNER = 12;
    public static final int ARCHITECT = 13;

    public static final int PC = 21;
    public static final int NOTEBOOK = 22;
    public static final int PRINTER = 23;
    //Employee:10, id, name, age salary
    //Programmer: 11, id, name, age salary
    //Designer: 12 id, name, ag,salary, bonus
    //Architect: 13, id, name, age, salary, bonus, stock
    public static final String[][] EMPLOYEES = {
            {"10", "1", "马  云", "22", "3000"},
            {"13", "2", "马化腾", "32", "18000", "15000", "2000"},
            {"11", "3", "李彦宏", "23", "7000"},
            {"11", "4", "刘强东", "24", "7300"},
            {"12", "5", "雷  军", "28", "1909", "50"},
            {"11", "6", "任志强", "22", "688"},
            {"12", "7", "柳传志", "29", "19860", "520"},
            {"13", "8", "杨元庆", "39", "1989", "159", "250"},
            {"12", "9", "史玉柱", "26", "989", "556"},
            {"11", "10", "丁  磊", "21", "6609"},
            {"11", "11", "张朝阳", "25", "7100"},
            {"12", "12", "杨致远", "27", "9660", "480"}
    };
    //如下的EQUIPMENTS数组与上面的 EMPLOYEES数组元素一一对应
    // PC:        21, model, display
    // Notebook: 22, model, price
    // Printer: 23, name, type
    public static final String[][] EQUIPMENTS = {
            {},
            {"22", "联想T4", "689"},
            {"21", "戴尔", "NEC17す"},
            {"21", "戴尔", "三星17寸"},
            {"23", "佳能2909", "激光"},
            {"21", "华硕", "三星17寸"},
            {"21", "华硕", "三星17寸"},
            {"23", "爱普生2K", "针式"},
            {"22", "惠普m6", "580"},
            {"21", "戴尔", "NEC17寸"},
            {"21", "华硕", "三星17寸"},
            {"22", "惠普m6", "580"}
    };
}
