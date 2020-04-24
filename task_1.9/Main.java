import java.util.Scanner;
public class Main {
         public static void main(String[] args) {
             Scanner scan=new Scanner(System.in);
             System.out.print("Введите первое число   ");
             double cislo1=scan.nextInt();
             System.out.print("Введите второе число   ");
             double cislo2=scan.nextInt();
             double summa;
             if (cislo1>cislo2) System.out.println("Максимальное число: "+cislo1);
             else  if (cislo1==cislo2) {
                 summa = cislo1 + cislo2;
                 System.out.println("числа равны. их сумма равна: " + summa);
             }
                    else
             {
                 System.out.println("Максимальное число: "+cislo2);
             }
         }
}
