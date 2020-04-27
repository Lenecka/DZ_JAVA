import java.util.*;
import static java.util.Scanner.*;

public class Main {
    public static void main(String[] args) {
       /*  Задача 2.10 Назовем «весом числа» сумму его цифр.
       Напишите код, который принимает от пользователя число и выводит на экран его «вес».
        */
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        System.out.print("Вес числа: ");
        while (n != 0) {
            //Суммирование цифр числа
            sum += (n % 10); //sum=sum+(n%10)
            n /= 10;
        }
        System.out.println(sum + " ");
    }
}
