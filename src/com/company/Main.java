package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.deposit(10000);
        while (true) {
            try {
                bankAccount1.withDraw(6000);
            } catch (LimitException r) {
                System.out.println("У вас на балансе = " + bankAccount1.getAmount());
                LimitException limitException = new LimitException();
                bankAccount1.amount = limitException.getRemainingAmount()- limitException.getRemainingAmount();

                System.out.println(r.getMessage());
                System.out.println("У вас на балансе " + bankAccount1.getAmount());
                break;
            }

        }
    }
}