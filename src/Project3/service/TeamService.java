package Project3.service;

import Project3.domain.Architect;
import Project3.domain.Designer;
import Project3.domain.Employee;
import Project3.domain.Programmer;

public class TeamService {
    private static int counter = 1;//成员唯一ID
    private final int MAX_MEMBER = 5;//最大的成员数
    private Programmer[] team = new Programmer[MAX_MEMBER];//装取成员
    private int total = 0;//实际的数量

    public TeamService() {
    }

    /**
     * 获得现在有的成员
     *
     * @return
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 将指定的员工添加到开发团队中
     * <p>
     * <p>
     * 成员已满,无法添加
     * 该成员不是开发人员,无法添加
     * 该员工已在本开发团队中
     * 该员工已是某团队成员
     * 该员正在休假,无法添加
     * 团队中至多只能有一名架构师
     * 团队中至多只能有两名设计师
     * 团队中至多只能有三名程序员
     *
     * @param e
     */
    public void addMember(Employee e) throws TeamException {
        //成员已满,无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满,无法添加");
        }
        //该成员不是开发人员,无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员,无法添加");
        }
        //该员工已在本开发团队中
        if (isExist(e)) {
            throw new TeamException("该员工已在本开发团队中");
        }
        //该员工已是某团队成员
        //该员正在休假,无法添加
        Programmer p = (Programmer) e;
        if ("BUSY".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("该员工已是某团队成员");
        } else if ("VOCATION".equalsIgnoreCase(p.getStatus().getNAME())) {
            throw new TeamException("该员正在休假,无法添加");
        }
        //团队中至多只能有一名架构师
        //团队中至多只能有两名设计师
        //团队中至多只能有三名程序员

        //添加各个的人数
        int numOfArc = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArc++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }
        if (p instanceof Architect) {
            if (numOfArc >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }


        //添加
        team[total++] = p;
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);

    }

    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            return this.team[i].getId() == e.getId();
        }
        return false;
    }

    /**
     * 删除成员
     *
     * @param memberId
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.BUSY);
                break;
            }
        }
        if (i == total) {
            throw new TeamException("没有找到所删除的元素");
        }
        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }
        team[--total] = null;


    }
}
