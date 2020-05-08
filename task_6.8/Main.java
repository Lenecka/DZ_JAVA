/* Задача 6.8
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5; */

public class Main {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
            //System.out.println(m[8]);
            }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка! Выход за пределы массива");
            e.printStackTrace();
        }
    }
}
