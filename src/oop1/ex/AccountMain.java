package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000);
        account.withdraw(5000);
        account.deposit(5000);
        account.checkBalance();
    }
}
