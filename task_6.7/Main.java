/* Задача 6.7
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase(); */



public class Main {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        }catch (NullPointerException e){
            System.out.println("Ошибка! Текст отсутствует");
            e.printStackTrace();
        }
    }
}
