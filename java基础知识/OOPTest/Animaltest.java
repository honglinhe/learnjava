// package OOPTest;
/*


*/
public class Animaltest {
    public static void main(String[] arg ) {
        Animal a = new Animal();
        // a.legs= 4;
        a.setLegs(4);
    }
}

class Animal {
    private int legs;

    public void setLegs(int l) {
        if (l >= 0) {
            System.out.println("jiao" + l);
        }
    }
}