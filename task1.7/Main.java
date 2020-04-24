import java.util.Scanner;
public class Main {
         public static void main(String[] args) {
             Scanner scan=new Scanner(System.in);
             System.out.print("Введите радиус окрудности и нажмите enter   ");
             double redius=scan.nextInt();
            //    if (redius!=null||redius==[0,999]);
             //       else System.out.print("Значение введено не верно. Пожалуйста, повторите попытку");
             double l,Pi;
             Pi=3.14;
             l=2*Pi*redius;
             System.out.print("Длина окружности равна   "+l);
         }
}
