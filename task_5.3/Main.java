import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Задача 5.3
        /* /* Реализовать метод boolean fight(Cat anotherCat):
* реализовать механизм драки котов в зависимости от их веса, возраста и силы.
* Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
* Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
* Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
* если cat1.fight(cat2) возвращает true,
* то cat2.fight(cat1) должен возвращать false. */

        //напишите тут ваш код
        Cat cat =new Cat( 13, 4, 70);
        Cat cat2 =new Cat(10, 2, 80);
       if(cat.fight(cat2)) System.out.print("Выиграл кот : 1");
       else System.out.print("Выиграл кот : 2");
    }
}
class Cat {

    public int age;
    public int weight;
    public int strength;

    public Cat(int age, int weight, int strength) {

        this.age = age;
        this.weight = weight;
        this.strength = strength;

    }

    public boolean fight(Cat anotherCat) {
        int n = 0; //счетчик для 1 кота
        int k = 0; //счетчик для 2 кота
        if (this.age >= anotherCat.age) n++;
        else if(this.age == anotherCat.age) k++;
        if(this.weight>=anotherCat.weight) n++;
        else if(this.weight==anotherCat.weight) k++;
        if (this.strength >= anotherCat.strength) n++;
        else if(this.strength == anotherCat.strength) k++;
        if(n>=k) return true;
        else return false;
    }
