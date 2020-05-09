/*Задача 6.5
 Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace. */

public class Main {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        return Thread.currentThread().getStackTrace()[0].getMethodName();
    }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[1].getMethodName();
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }

    public static String method5() {
        return Thread.currentThread().getStackTrace()[4].getMethodName();
    }
}
