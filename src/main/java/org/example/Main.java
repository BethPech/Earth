package org.example;

public class Main {

    public static void main(String[] args) {
        // нет объекта земли
        Earth earth1 = Earth.getInstance();

        // уже есть объект земли
        Earth earth2 = Earth.getInstance();

        System.out.println(earth1);
    }


}