package oop.udemyandtechproexamples.ooppart01.classesandconstructors;

public class VipCustomer {
    private String vipCustomerName;
    private double creditLimit;
    private String vipCustomerEmail;

    public VipCustomer(){
        this("default name",100,"default@email.com");
    }

    public VipCustomer(String vipCustomerName,double creditLimit){
        this(vipCustomerName,creditLimit,"unknown");
    }

    public VipCustomer(String vipCustomerName, double creditLimit, String vipCustomerEmail){
        this.vipCustomerName=vipCustomerName;
        this.creditLimit=creditLimit;
        this.vipCustomerEmail=vipCustomerEmail;
    }

    public String getVipCustomerName() {
        return this.vipCustomerName;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getVipCustomerEmail() {
        return this.vipCustomerEmail;
    }
}
