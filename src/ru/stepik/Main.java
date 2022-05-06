package ru.stepik;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

    }

    public static void task2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3() {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника - " + fullName);

    }

    public static void task4() {
//        Решение 5 задачи через метод split
        String fullName = "Ivanov Ivan Ivanovich";
        String[] separate = fullName.split(" ");
        for (int i = 0; i < separate.length; i++) {
            System.out.println(separate[i]);
        }
    }

    public static void task5() {
//        Решение 5 задачи согласно требованиям
        String fullName = "Ivanov Ivan Ivanovich";
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        String middleName = fullName.substring(fullName.lastIndexOf(" ") + 1);
        System.out.println("Имя сотрудника — " + lastName);
        System.out.println("Фамилия сотрудника — " + firstName);
        System.out.println("Отчество сотрудника — " + middleName);
    }

    public static void task6() {
        String fullName = "ivanov ivan ivanovich";
        char[] arrayFullName = fullName.toCharArray();
        arrayFullName[0] = Character.toUpperCase(arrayFullName[0]);
        for (int i = 1; i < arrayFullName.length; i++) {
            if (arrayFullName[i] == ' ' && arrayFullName[i + 1] != ' ') {
                arrayFullName[i + 1] = Character.toUpperCase(arrayFullName[i + 1]);
            }
        }
        fullName = new String(arrayFullName);
        System.out.print(fullName);

    }

    public static void task7() {
        String num = "135";
        String num1 = "246";
        StringBuilder numbers = new StringBuilder(num.substring(0, 1) + num1.substring(0, 1) + num.substring(1, 2) + num1.substring(1, 2) + num.substring(2, 3) + num1.substring(2, 3));
        System.out.println(numbers);
    }

    public static void task8() {
        String str = "aabccddefgghiijjkk";
        char[] array = str.toCharArray();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println(array[i]);
            }
        }
    }
}
