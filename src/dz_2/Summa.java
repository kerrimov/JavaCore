package dz_2;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        System.out.println("Введите n");
        Scanner scr = new Scanner(System.in);
        if (scr.hasNextInt()) {
            int n = scr.nextInt();
            if (n > 0 && n < 99) {
                System.out.print((n / 10) + (n % 10));
            } else {
                System.out.println("Число не двузначное");
            }
        }
    }
}
