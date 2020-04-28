import java.util.*;
public class Main {
    public static void main(String[] args) {
       /*Задание 2,11: В переменной min лежит число от 0 до 59.
        Определите в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
        */
       /* int[] mas =new int[60];
        for (int i=0;i<=59;i++) {
            mas[i] = i;
        }
        System.out.println(Arrays.toString(mas));
        int min=new Random().nextInt(mas.length);
        System.out.println("Ваше число из множества: "+min);
          */
         Scanner scan = new Scanner(System.in);
        System.out.print("Введите число от 0 до 59   ");
        double cislo=scan.nextInt();
        if(cislo>=0&&cislo<=59) {
            if (cislo>=0&&cislo<=(60/4))
               System.out.println("Ваше число попало в первую четверть часа");
               else if (cislo>=(60/4+1)&&cislo<=(60/4*2))
                System.out.println("Ваше число попало во вторую четверть часа");
                    else if (cislo>=(60/4*2+1)&&cislo<=(60/4*3))
                    System.out.println("Ваше число попало в тетью четверть часа");
                        else if (cislo>=(60/4*3+1)&&cislo<=60)
                        System.out.println("Ваше число попало в четвертую четверть часа");
        }
        else System.out.println("Вы ввели неверное число. Попробуйте снова");
    }

}
