package Project3.view;

import Project3.domain.Employee;
import Project3.domain.Programmer;
import Project3.service.NameListService;
import Project3.service.TeamException;
import Project3.service.TeamService;

public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    public void enterMainMenu() {
        boolean loopFlag = true;
        char menu = 0;
        while (loopFlag) {
            if (menu != '1') {

                listAllEmployees();
            }
            System.out.print("1-团队列表 2-添加团队成员 3-册除团队成员 4-退出 请选择(1-4):");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
//                    System.out.println("退出");
                    System.out.print("是否确认退出（Y/N）");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        loopFlag = false;
                    }
                    break;

            }
        }
    }

    private void listAllEmployees() {
//        System.out.println("显示列表");
        System.out.println("---开发团队调度软件----------------\n");
        Employee[] employees = listSvc.getAllEmployees();
        if (employees == null || employees.length == 0) {
            System.out.println("没有任何的员工信息");
        } else {
            System.out.println("ID\t姓名\t\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }
        System.out.println("----------------------------------");
    }

    private void getTeam() {
//        System.out.println("获得");
        System.out.println("-----------团队成员列表--------------");
        Programmer[] team= teamSvc.getTeam();
        if (team == null||team.length==0){
            System.out.println("团队中没有团队成员");
        }else {
            System.out.println("TID/ID\tt姓名\t年龄\t工资\t职位\t奖金\t股票\n");
            for (int i = 0;i<team.length;i++){
                System.out.println(team[i].getTeamNumber());
            }
        }
        System.out.println("-------------------------------------");
    }


    private void addMember() {
//        System.out.println("增加成员");
        System.out.println("---------------添加成员------------");
        System.out.println("请输入添加成员的ID");
        int id = TSUtility.readInt();
        try {
            Employee ee = listSvc.getEmployees(id);
            teamSvc.addMember(ee);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因是"+e.getMessage());
        }
        TSUtility.readReturn();
        System.out.println("-----------------------------------");
    }

    private void deleteMember() {
//        System.out.println("删除成员");
        System.out.println("----------------删除成员-------------------");
        System.out.println("请输入想要删除的Id");
        int memberId = TSUtility.readInt();
        System.out.println("确认删除（Y/N）");
        char isDelete = TSUtility.readConfirmSelection();
        if (isDelete=='N'){
            return;
        }else {
            try {
                teamSvc.removeMember(memberId);
                System.out.println("删除成功");
            } catch (TeamException e) {
                System.out.println("删除失败，原因是"+e.getMessage());
            }

        }
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }


}
