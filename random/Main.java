import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       /*Задание Вывести случайное число от 50 до 100
        */
       final int max = 100;
       final int min=50;
       final int rnd=rnd(min,max);
       System.out.println("Случайное число: "+rnd);
    }
    public static int rnd(int min, int max) {
    max-=min;
    return(int)(Math.random()*++max)+min;
    }

}
