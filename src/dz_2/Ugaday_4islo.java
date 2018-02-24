package homework.dz_2;

import java.util.Scanner;

public class Ugaday_4islo {
    public static void main (String[] args){
        System.out.println("Введите любое число от 1 до 10");
        Scanner scr = new Scanner(System.in);
        if (scr.hasNextInt()){
            int num = scr.nextInt();
            if (num>0 && num<11){
                int ran = 1 + (int) (Math.random() * 10);
                System.out.println(ran);
                if (num == ran){
                    System.out.println("Вы угадали число!");
                }
                else{
                    System.out.println("Число не угадано:(");
                }
            }
            else {
                System.out.println("Число введено не верно.");
            }
        }
    }
}
