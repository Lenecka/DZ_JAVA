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
       // min(5,7);
        System.out.print("Минимальное чосло равно: ");
        System.out.print(min(a,b));

    }
    static int min(int a, int b) {
        if (a > b) return b;
        else if(a<b)return a;
        else return a=b;
    }
}
