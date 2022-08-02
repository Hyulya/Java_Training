package oop.udemyandtechproexamples.visibilitytopic.accessmodifiers;

/*
Access modifiers:
- private
- default i.e. package-private
- protected
- default
 */

import java.util.ArrayList;

public class Account {
    // Initially we set these access modifiers to public, but this would mean that they are accessible in the Main class and
    // could be changed easily (fraud actions), so the solution is to make them private so that they are not directly accessible
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName){
        this.accountName=accountName;
        this.transactions=new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount>0){
            transactions.add(amount);
            this.balance+=amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount){
        int withdrawal = -amount;
        if (withdrawal<0) {
            this.transactions.add(withdrawal);
            this.balance+=withdrawal;
            System.out.println(amount+ " withdrawn. The current balance is " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance(){
        this.balance=0;
        for (int i : this.transactions) {
            this.balance+=i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
