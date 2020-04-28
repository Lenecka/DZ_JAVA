import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Задача 4.3
            Написать функцию, которая возвращает минимум из четырёх чисел.
            Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
            (которую вы разработали в задаче 4.1).
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число 1   ");
        int a = scan.nextInt();
        System.out.print("Введите число 2   ");
        int b = scan.nextInt();
        System.out.print("Введите число 3   ");
        int c = scan.nextInt();
        System.out.print("Введите число 4   ");
        int d = scan.nextInt();
        // min(5,7);
        System.out.print("Минимальное число равно: ");
        System.out.print(min(a,b,c,d));
    }

    static void min(int a, int b, int c, int d) {
        a=min(a,b);
        b=c;
        a=min(a,b);
        b=d;
        min(a,b);
    }

    static int min(int a, int b) {
        if (a > b) return b;
        else if(a<b)return a;
        else return a=b;
    }
}
