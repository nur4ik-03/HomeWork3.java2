package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.deposit(10000);
        while (true) {
            try {
                bankAccount1.withDraw(6000);
            } catch (LimitException r) {
                System.out.println(r.getMessage());
                break;
            }

        }
    }
}