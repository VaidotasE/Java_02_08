package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ivesk kilometrus: ");
        float atstumas = sc.nextFloat();
        System.out.println("Ivesk litrus: ");
        float litrai = sc.nextFloat();

        float vidurkis = (litrai*100)/atstumas;
        System.out.println("Vidurkis: " + vidurkis);
    }
}
