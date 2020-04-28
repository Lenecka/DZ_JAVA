import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Задача 4.1 Написать функцию, которая возвращает минимум из двух чисел.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 1   ");
        int a = scan.nextInt();
        System.out.print("Введите число 2   ");
        int b = scan.nextInt();
        min(a, b);
    }

    static void min(int a, int b) {
        if (a > b) System.out.println("Минимальное число "+b);
        else if(a<b)System.out.println("Минимальное число "+a);
        else System.out.println("Числа равны");
    }
}
