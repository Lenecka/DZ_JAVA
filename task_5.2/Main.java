import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Задача 5.2
        /* Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
* Создайте объект класса Сat
        public class Main {
            public static void main(String[] args) {
                //напишите тут ваш код
            }
        }
        class Cat{
            //напишите тут ваш код
        }
         */

    Cat cat = new Cat();
    cat.name="Мурзик";
    cat.age=2;
    cat.strength=30;
    cat.weight=10;
    cat.Predstavlenie();
    }
}
class Cat{
    String name;
    int age;
    int weight;
    int strength;
        void Predstavlenie(){
            System.out.println("Привет! Меня зовут "+name+" Мой возраст: "+age+" Я вешу: "+weight+" Я сильный на "+strength+" %");
        }
}
