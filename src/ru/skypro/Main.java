package ru.skypro;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    }
    public static void task1(){
        int i = 1;
        while (i <= 10) {
            System.out.print(" "+i);
            i++;
        }
        System.out.println();
        for (i = 10; i>=1; i--){
            System.out.print(" " +i);
        }
        System.out.println();
    }

    public static void task2(){

        int friday = 6;
        while ( friday <= 31 ){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }
        for (friday = 6; friday <= 31; friday = friday +7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет. !!!!");
        }

    }

    public static void task3(){
        int periodUpTo = 200;
        int periodAfter = 100;

        for (int year = 0; year <= 2022 + periodAfter; year = year + 79){
            if (year >= 2022 - periodUpTo)
                System.out.println( + year);
        }

    }
    }

