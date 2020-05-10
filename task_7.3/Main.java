import java.time.LocalDate;
import java.util.Scanner;

/* Задача 7.3: Разработать метод который возвращает дату пасхи.
Передаём в качестве параметра год. Метод возвращает дату пасхи в этом году.
Подсказка: воспользуйтесь алгоритмом Гаусса вычисления даты Пасхи.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год     ");
        int date = scan.nextInt();
    }

    static LocalDate getEaster(int date) {
        //int date;
        int a = date % 19;
        int b = date % 4;
        int c = date % 7;
        int d = (19 * a + 15) % 30;
        int e = (2 * b + 4 * c + 6 * d + 6) % 7;
        int f = d + e;
        if (f <= 26) {
            int k = f + 4;
            int mes=04;
            LocalDate Pasha=LocalDate.of(date,mes,k);
             return Pasha;        //System.out.println("Пасха: "+k+"апреля");
        }
         else {
            LocalDate Pasha=LocalDate.of(date,05,26);
            return Pasha;      //System.out.println("Пасха: 26 мая");
        }
    }
    }
