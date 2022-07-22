package oop.udemyandtechproexamples;

public class VipCustomerRunner {
    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getVipCustomerName());

        VipCustomer customer2 = new VipCustomer("Tim",400);
        System.out.println(customer2.getVipCustomerName());

        VipCustomer customer3 = new VipCustomer("Sarah",300,"s@email.com");
        System.out.println(customer3.getVipCustomerName());
        System.out.println(customer3.getVipCustomerEmail());
    }
}
