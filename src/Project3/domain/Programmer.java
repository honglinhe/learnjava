package Project3.domain;

import Project3.service.Status;

public class Programmer extends Employee {
    private int memberId;
    private Status status =Status.FREE;
    private Equipment equipment;

    public Programmer(Equipment equipment, int id, String name, int age, double salary) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Programmer() {
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() +
                "\t程序员\t"
                + status +
                "\t\t\t" + equipment.getDescription()
                ;
    }
    public String getTeamBaseNumber(){
        return getMemberId() + "/" + getId() +"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t";
    }
    public String getTeamNumber(){
        return getTeamBaseNumber() +"程序员";
    }
}
