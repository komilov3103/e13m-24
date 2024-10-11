package ru.mpei.l3.homeWorks;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.putMoney(10000);
        System.out.println(account.checkMoney());
        System.out.println(account.checkInDollars());
        System.out.println(account.checkInEuro());

        int allMoneyInAccount = account.withdrawMoney();
        System.out.println(allMoneyInAccount);
        System.out.println(account.checkMoney());
    }
}
