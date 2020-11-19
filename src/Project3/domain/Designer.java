package Project3.domain;

public class Designer extends Programmer {
    private double bonus;

    public Designer(Equipment equipment, int id, String name, int age, double salary, double bonus) {
        super(equipment, id, name, age, salary);
        this.bonus = bonus;
    }

    public Designer() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t" + getEquipment().getDescription();
    }
    public String getTeamNumber(){
        return getTeamBaseNumber()+"\t设计师\t"+getBonus();
    }
}
