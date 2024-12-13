package Task.Task_17102024;

import java.util.Scanner;

public class Task_17102024_t1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TAKING USER INPUT
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Printing User Input
        System.out.println("Name:" + name);
        System.out.println("Age:"+ age);
        System.out.println("Salary:" + salary);

        scanner.close();










    }
}
