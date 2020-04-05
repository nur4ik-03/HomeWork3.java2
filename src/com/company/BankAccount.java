package com.company;

public class BankAccount {
  private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public BankAccount(){}

    public double getAmount() {
        return amount;
    }
    public void withDraw(int sum) throws LimitException {
        if (getAmount() < sum) {
            System.out.println("Вы можете снять только "  + amount);
            amount = amount - amount;
            System.out.println("Остаток на счёта " + amount);
            throw new LimitException("Недостаточно средств на балансе. Остаток средств на счёта    ", getAmount());
        } else {
            System.out.println("Снято со счёта " + sum);
            System.out.println("Остаток на счёта " + (amount = amount - sum));
        }
    }
        /*if (getAmount() < sum) {
            throw new LimitException("У Вас недостаточно средств", getAmount());
        }
        amount = amount - sum;
        System.out.println("C вашего счёта снято  = " + sum);


    }*/

    public double deposit(double sum){
        if (sum > 0){
        amount = amount + sum;
        System.out.println("На ваш счёт зачислено = " + amount);
        }
        return sum;
    }
}
