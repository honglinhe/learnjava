package CommonClass.Comparable;

//public class Goods implements Comparable {
//    private String name;
//    private double p;
//
//    @Override
//    public String toString() {
//        return "Goods{" +
//                "name='" + name + '\'' +
//                ", p=" + p +
//                '}';
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getP() {
//        return p;
//    }
//
//    public void setP(double p) {
//        this.p = p;
//    }
//
//    public Goods(String name, double p) {
//        this.name = name;
//        this.p = p;
//    }
//
//    public Goods() {
//    }
//
//
//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof Goods) {
//            Goods goods = (Goods) o;
//            return Double.compare(this.p, goods.p);
//        }
//        throw new RuntimeException("error");
//    }
//
//}
