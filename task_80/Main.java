import java.util.*;
public class Main {
    public static void main(String[] args) {
       /*Задача №80 (Повышенная сложность)

    1. Создай массив чисел.
    2. Добавь в массив 10 чисел с клавиатуры.
    3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

    Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
    Результат: 3
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите массив из 10 чисел. После каждой нажмите Enter   ");
        int[] mas =new int[10];
        for (int i = 0; i < mas.length; i++) {
            if (!scan.hasNextInt()) //проверка-введены цифры?
            {
                System.out.print("Введеные значения не являются числами   ");
                System.exit(0);
            }
            mas[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(mas));
        int l=0;
        int k=0;
        for (int i = 0; i < mas.length-1; i++) {
        if (mas[i]==mas[i+1]) {
            k++;
            // System.out.println("счетчик увеличился " + k);
        }
        else if(k>l) {
            l = k;
            k=0;
            //System.out.println("счетчик 2 увеличился " + l);
        }
            else k=0;
        }
        if(k>l)
        System.out.print("Длина самой длинной последовательности повторяющихся чисел в списке равна "+(k+1));
        else System.out.print("Длина самой длинной последовательности повторяющихся чисел в списке равна "+(l+1));
        }

    }
