import java.util.*;
public class Main {
    public static void main(String[] args) {
       /* Задание 3,2: Дан массив с числами.
       Проверьте, есть ли в нем два одинаковых числа подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размерность массива   ");
        int j=scan.nextInt();
        int l=0;
        int[] mas =new int[j];
        for (int i = 0; i < j; i++) {

            mas[i] = new Random().nextInt(mas.length);
        }
        System.out.println(Arrays.toString(mas));
        for(int i = 0; i <j-1; i++)
        {
            if(mas[i]==mas[i+1]) {
                System.out.print("Да");
                System.exit(0);
            }
        }
        System.out.print("Нет");
    }

}
