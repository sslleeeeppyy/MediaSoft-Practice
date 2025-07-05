package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Задание 1 (Массивы)");
            System.out.println("2. Задание 2 (Коллекции)");
            System.out.println("3. Задание 3 (Car)");
            System.out.println("4. Задание 4 (Stream API)");
            System.out.println("0. Выход");
            System.out.print("Выберите: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    CarTasks.task1();
                    break;
                case 2:
                    CarTasks.task2();
                    break;
                case 3:
                    CarTasks.task3();
                    break;
                case 4:
                    CarTasks.task4();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }
}