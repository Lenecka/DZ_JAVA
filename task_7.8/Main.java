/* Задача 7.8
Добавить одну операцию по преобразованию типа, чтобы на экран вывелось 9
short number = 9;
char zero = '0';
int nine = (zero + number);*/

public class Main {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int zero1 = Character.getNumericValue(zero);
        //int number1 =(int) number;
        int nine = (zero1 + number);
        System.out.println(nine);
    }
}
