package Multithreading;

public class lanhan {
}

class Bank {
    private Bank() {
    }

    private static Bank instance = null;

    public static Bank getInstance() {
        return instance;
    }
}
