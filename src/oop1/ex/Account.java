package oop1.ex;

public class Account {
    int valance = 0;

    void deposit(int amount) {
        valance += amount;
        System.out.println(valance + "원");
    }

    void withdraw(int amount) {
        if (valance < amount) {
            System.out.println("잔액부족!!");
        } else {
            valance -= amount;
        }
        System.out.println(valance + "원");
    }

    void checkBalance() {
        System.out.println("현재 잔액: " + valance);
    }
}
