package oop.udemyandtechproexamples.visibilitytopic.accessmodifiers;

public class Main {
    public static void main(String[] args) {
        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();
        // we have all the fields as public in the Account class which means that anyone can interfere to these fields directly:
      //  timsAccount.balance=5000; // not good at all, it will be counted as fraud, so we need to have them as private

        System.out.println("Balance on account is " + timsAccount.getBalance());
      //  timsAccount.transactions.add(4500);
        timsAccount.calculateBalance();
    }
}
