package Seminar_2;

import java.util.Scanner;

//Дана последовательность N целых чисел. Найти сумму простых чисел.
public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Какой длины будет последовательность  - ");
        int length = scanner.nextInt();
        int count = 0;
        for (int i = 2; i - 2< length; i++) {
            System.out.print("Ведите число " + (i-1) + " - " );
            int a = scanner.nextInt();
            if (a == 2 || a == 3 || a ==5)
                count = count + a;
            if ( a % 2 != 0 && a != 1 && a % 3 != 0 && a % 5 != 0)
                count = count + a;
        }
        System.out.println(count);

    }

}
