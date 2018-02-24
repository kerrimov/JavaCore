package dz_4;

import java.util.Scanner;

public class Sum_natural {
    public static void main(String[] args){
        System.out.println("Сколько натуральных значений хотите ввести?");
        Scanner scr = new Scanner(System.in);
        int count = scr.nextInt();
        int sum = 0;
        System.out.println("Введите их");
        for(int i=0; i<=count-1;i++) {
            int num = scr.nextInt();
            sum = sum + num;
        }
        System.out.println("Сумма чимел: "+ sum);

    }
}
