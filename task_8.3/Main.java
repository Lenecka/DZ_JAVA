/*Задача 8.3
Перед решением прочтите https://www.codeflow.site/ru/article/java-buffered-reader
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
/*
Модернизация ПО
*/
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String>person=new HashMap<String,String>();
        System.out.println("Введите город и фамилию через Enter. Для окончания ввода-пустая строка");
        while (true) {
            String gorod = reader.readLine();
            if (gorod.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            person.put(gorod,family);
        }
        System.out.println(person);
        // Read the house number
        //int houseNumber = Integer.parseInt(reader.readLine());
       // if (0 <= houseNumber && houseNumber < list.size()) {
           // String familyName = list.get(houseNumber);
           // System.out.println(familyName);
        System.out.println("Введите город для выбора человека по городу");
        String s = reader.readLine();
        System.out.println(person.get(s));
        }
    }
