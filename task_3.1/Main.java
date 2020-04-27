import java.util.*;
public class Main {
    public static void main(String[] args) {
       /*Задание 3,1: Дан массив с числами.
       Проверьте, что в этом массиве есть число 5. Если есть - выведите 'да', а если нет - выведите 'нет'.
        */
        int [] mas={7, 4, 1, 7, 3, 6, 7, 3, 4, 2};
        int l=0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 5) {
                System.out.println("Да");
                System.exit(0);
            } else
                l = 1;
        }
        if(l==1)
            System.out.println("Нет");
    }

}
