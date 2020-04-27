import java.util.*;
public class Main {
    public static void main(String[] args) {
       /*Задание 2.5: Пользователь вводит сумму вклада и процент,
        который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму вклада   ");
        double sum=scan.nextInt();
        System.out.print("Введите процент   ");
        double proc=scan.nextInt();
        double god,rez=0;
        for (int i = 0; i < 5; i++) {
            rez=(sum*proc)/100;
            god=sum+rez;
            System.out.print("Размер вклада на конец   "+(i+1)+"  года равен   "+god+"\n");
            sum=god;
        }
     }

    }
