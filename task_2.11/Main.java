import java.util.*;
public class Main {
    public static void main(String[] args) {
       /*Задание 2,11: В переменной min лежит число от 0 до 59.
        Определите в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
        */
        int[] mas =new int[60];
        for (int i=0;i<=59;i++) {
             mas[i] = i;
         }
        System.out.println(Arrays.toString(mas));
        int min=new Random().nextInt(mas.length);
        System.out.println("Ваше число из множества: "+min);
       for(int i=0;i<mas.length/4;i++) {
           if (min == mas[i])
               System.out.println("Ваше число попало в первую четверть часа");
       }
        for(int i=mas.length/4+1;i<mas.length/4*2;i++) {
            if (min == mas[i])
                System.out.println("Ваше число попало во вторую четверть часа");
        }
        for(int i=mas.length/4*2+1;i<mas.length/4*3;i++) {
            if (min == mas[i])
                System.out.println("Ваше число попало в тетью четверть часа");
        }
        for(int i=mas.length/4*3+1;i<mas.length;i++) {
            if (min == mas[i])
                System.out.println("Ваше число попало в четвертую четверть часа");
        }
    }

}
