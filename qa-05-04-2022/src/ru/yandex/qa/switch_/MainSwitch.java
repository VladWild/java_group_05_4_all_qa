package ru.yandex.qa.switch_;

import java.util.Scanner;

public class MainSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Все ОК!!!!!");
                break;
            case 2:
                System.out.println("Все норм!!!!");
                break;
            case 3:
                System.out.println("Все не понятно!!!!!");
                break;
            //case 4 == number: //так нельзя
            default:
                System.out.println("Непонятно");
        }

        scanner.close();
    }
}
