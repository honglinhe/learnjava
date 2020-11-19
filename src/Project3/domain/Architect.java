package Project3.domain;

public class Architect extends Designer {
    private int stock;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Architect() {
    }

    public Architect(Equipment equipment, int id, String name, int age, double salary, double bonus, int stock) {
        super(equipment, id, name, age, salary, bonus);
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
    }
    public String getTeamNumber(){
        return getTeamBaseNumber()+"\t架构师\t"+getBonus()+"\t"+getStock();
    }
}
