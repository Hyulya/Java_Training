package oop.estafetbacklog01.task04;

public class ComputerDemo {

    public static void main(String[] args) {

        /*
        Within the main method, create 2 objects of type Computer.
        Аssign values to each of the computers for year, price, hardDiskMemory, freeMemory, operationSystem.
        Let one computer be a laptop. One of the two computers should be allocated memory 100 (via useMemory method),
        and on the other, to change the operating system (via changeOperationSystem method),
        then display all fields on both computers.
         */

        Computer computer = new Computer(2020, 1000, false, 5, 1000, "Mac");
        Computer laptop = new Computer(2022, 2000, false, 10, 5, "Windows 11");

        computer.useMemory(100);
        laptop.changeOperationSystem("Mac");
        System.out.println(computer);
        System.out.println(laptop);

        // Create several objects of type Computer (via the available constructors)
        Computer computer1 = new Computer();
        System.out.println(computer1);

        Computer computer2 = new Computer(2022, 4444, 23, 22);
        System.out.println(computer2);

        Computer computer3 = new Computer(2021, 3333, true, 10, 12, "Android");
        System.out.println(computer3);

        Computer computer4 = new Computer(2019, 3333, false, 100, 13, "Linux");

        // Compare the prices of some of the computers (using the method comparePrice) and display an appropriate message.
        System.out.println(computer.comparePrice(laptop)); // 1.0
        System.out.println(computer2.comparePrice(computer1)); // -1.0
        System.out.println(computer3.comparePrice(computer4)); // 0.0

    }
}