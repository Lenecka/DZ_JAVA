/*Задача 7.5
Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b); */

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        System.out.println(b);
        System.out.println(a);
        byte c = (byte) (a * b);
        System.out.println(c);
        double f = (char) 1234.15;
        System.out.println(f);
        long d = (int) (a + f / c + b);
        System.out.println(d);
    }
}
