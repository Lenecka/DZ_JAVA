/*Задача 7.2
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.
(Придётся погуглить коллекции)
*/
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Номер месяца
*/

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя месяца     ");
        String date = scan.nextLine();
        date=date.toLowerCase();//переводит все символы строки в нижний регистр
        List<String> stringList = new ArrayList<>();//создание нового списка
        stringList.add("Январь"); //добавление элементов
        stringList.add("Февраль");
        stringList.add("Март");
        stringList.add("Апрель");
        stringList.add("May");
        stringList.add("Июнь");
        stringList.add("Июль");
        stringList.add("Август");
        stringList.add("Сентябрь");
        stringList.add("Октябрь");
        stringList.add("Ноябрь");
        stringList.add("Декабрь");
        int n = stringList.indexOf(date);
        System.out.println(stringList.size());//размер списка
        System.out.println(date+" is the "+(n+1)+" month");
        //stringList.get(0);//получения элемента по индексу (начинается с 0 элемента)
    }
}
