import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Задача 4.2
        Написать функцию, которая возвращает минимум из трёх чисел.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 1   ");
        int a = scan.nextInt();
        System.out.print("Введите число 2   ");
        int b = scan.nextInt();
        System.out.print("Введите число 3   ");
        int c = scan.nextInt();
       // min(5,7);
        //System.out.print("Минимальное чосло равно: ");
        System.out.print(min(a,b,c));
    }
    static int min(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                System.out.print("Минимальное число равно: ");
                return a;
            }
            else {
                System.out.print("Минимальное число равно: ");
                return c;
            }
        }
        else if (b<c) {
            System.out.print("Минимальное число равно: ");
            return b;
        }
            else if(a==b&&b==c) {
            System.out.print("числа равны: ");
            return a;
        }
            else {
            System.out.print("Минимальное число равно: ");
            return c;
        }
    }
}
