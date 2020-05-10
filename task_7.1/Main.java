/* Задача 7.1
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате FEBRUARY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false*/

import java.text.ParseException;
import java.util.Date;
public class Main {
    public static void main(String[] args) throws ParseException {
        String date = "MAY 1 2013";
        System.out.println(isDateOdd(date));
        //Date d = new Date(date);
    }
    public static boolean isDateOdd(String date) throws ParseException {
        Date d = new Date(date);
        String date2 = "JANUARY 1 2013"; //задаем 1 января года от которого идет отсчет
        Date d2 = new Date(date2);
        long milliseconds =  d.getTime() - d2.getTime();
        int dni = (int) (milliseconds / (24 * 60 * 60 * 1000));
        dni++;
        System.out.println("Разница между датами в днях: " + dni);
        if(dni%2!=0)return true;
        else return false;
    }
}
