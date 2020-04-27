import java.util.*;
public class Main {
    public static void main(String[] args) {
       /*Задание 2,9: Напишите фрагмент кода, который принимает от пользователя число
       и если число четное то программа выводит на экран число, которое больше введенного
       с клавиатуры на 10, в противном случае выводит на экран число в 10 раз больше введенного.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: n=   ");
        int sum=scan.nextInt();
        if (sum%2!=0)
            System.out.print("Вы ввели нечетное число. n*10="+(sum*10));
        else System.out.print("Вы ввели четное число. n+10="+(sum+10));
    }

}
