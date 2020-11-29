package Multithreading;

class Account{
    private double yue;
    public Account (double yue){
        this.yue = yue;
    }
    public synchronized void deposit(double sum){
        if (sum > 0) {
            yue +=sum;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+yue);

        }
    }

}

class Couster extends Thread{
    private Account account;
    public Couster(Account account){
        this.account=account;
    }

    @Override
    public void run() {
        for (int i = 0;i<3;i++){
            account.deposit(1000);
        }
    }
}


public class AccountTest {
    public static void main(String[] args) {
        Account account  = new Account(1000);
        Couster couster1 = new Couster(account);
        Couster couster2 = new Couster(account);
        couster1.setName("甲");
        couster2.setName("已");

        couster1.start();
        couster2.start();

    }

}
