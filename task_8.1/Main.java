/* Задача 8.1: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой строки. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Задача по алгоритмам
*/

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Создает буферный поток ввода
        String[] array = new String[20]; //символов 20
        for (int i = 0; i < array.length; i++) { //конец строки? да/нет
            array[i] = reader.readLine(); //i-й элемент; readLine позволяет считывать из потока построчно
        }

        sort(array); //сортировка

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        String vrem;
        int k=array.length;
        for (int i = 0; i<k; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isGreaterThan(array[i], array[j])) {
                    vrem = array[i]; //временная переменная для обмена i и j местами
                    array[i] = array[j];
                    array[j] = vrem;
                    //i++;
                }
               // i++;
               }
           // i=0;
           // k--;
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
