package oop.udemyandtechproexamples.ooppart01.classesandconstructors;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Creating the constructor - we use it to initialize the object we're creating and
    // do whatever we want it to do at the time the object is created.

    public Account(){ // if you'd like a default constructor to give you default values, this can be achieved with this syntax:
        this("56789",2.50,"Default name", "default address","default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number,double balance, String customerName, String email,String phoneNumber){
        System.out.println("Account constructor with parameters called:");
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this("273636",100,customerName,email,phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+ " made. New balance is "+this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance-withdrawalAmount<0){
            System.out.println("Only " + this.balance + " avaiable. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance is "+ this.balance);
        }
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
