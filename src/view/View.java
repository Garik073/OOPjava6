package view;

import java.util.Map;
import java.util.Scanner;

import controller.VendingMachineController;

// Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, 
// усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.
//Домашня работа переделана полностью.
//ССылка на 4 домашнию работу 
// https://github.com/Garik073/OOPJava4/tree/master/src


public class View {
    public static void main(String[] args) {
        VendingMachineController vMachineController = new VendingMachineController();

        vMachineController.addProduct(Map.of("name", "Green tea", "cost", 70, "volume", 0.33, "temperature", 70));
        vMachineController.addProduct(Map.of("name", "Black tea", "cost", 90, "volume", 0.15, "temperature", 80));
        vMachineController.addProduct(Map.of("name", "dobale Hote chocolate", "cost", 90, "volume", 0.33, "temperature", 80));
        vMachineController.addProduct(Map.of("name", "Cappucino", "cost", 90, "volume", 0.22, "temperature", 70));
        vMachineController.addProduct(Map.of("name", "Latte", "cost", 60, "volume", 0.15, "temperature", 80));
        vMachineController.addProduct(Map.of("name", "Americano", "cost", 70, "volume", 0.22, "temperature", 80));

        System.out.println("Все продукты");
        for (String priceItem : vMachineController.getPpriceList()) {
            System.out.println(priceItem);

        }
        StarMenu();
    }

    private static void printMenu() {

        System.out.println("Выберете по какому параметру осуществить поиск напитка");
        System.out.println("1:По названию напитка");
        System.out.println("2:По температуре напитка");
        System.out.println("3:По обьему напитка ");
        System.out.println("4:Exit");

    }

    private static void StarMenu() {

        Scanner scanner = new Scanner(System.in);

        if (scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = scanner.nextInt();
                switch (key) {
                    case 1:
                        nameFind();
                        break;
                    case 2:
                        temperatureFind();
                        break;
                    case 3:
                        newVolme();
                        break;
                    case 4:
                        System.out.println("Завершение программы...");
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");
                }
            } while (key != 4);
        }

    }

    private static void nameFind() {

        VendingMachineController vMachineController = new VendingMachineController();
        Scanner scanner = new Scanner(System.in);
        String names;
        System.out.println("Введите Название напитка");
        names = scanner.next();
        System.out.println(vMachineController.getProductByMatchPattern(Map.of("name", names)));

    }

    private static void temperatureFind() {

        VendingMachineController vMachineController = new VendingMachineController();
        Scanner scanner = new Scanner(System.in);
        int newTemperature;
        System.out.println("Введите температуру напитка");
        newTemperature = scanner.nextInt();
        System.out.println(vMachineController.getProductByMatchPattern(Map.of("temperature", newTemperature)));

    }

    private static void newVolme() {
        VendingMachineController vMachineController = new VendingMachineController();
        Scanner scanner = new Scanner(System.in);
        double newVolme;
        System.out.println("Введите объем напитка");
        newVolme = scanner.nextDouble();
        System.out.println(vMachineController.getProductByMatchPattern(Map.of("volume", newVolme)));

    }
}
