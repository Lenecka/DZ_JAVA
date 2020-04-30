import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Задача 5.4
        Создать class Dog. У собаки должна быть кличка String name и возраст int age.
* Создайте геттеры и сеттеры для всех переменных класса Dog.
* Создайте объект Dog
        public class Main {
            public static void main(String[] args) {
                //напишите тут ваш код
            }
        }
        class Dog {
            //напишите тут ваш код
        }
        */

        Dog dog=new Dog("Тузик", 2);

    }
}
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        
        this.name=name;
        this.age=age;
    }

    //void Dog(String name,int age)
    //{
     //   this.name=name;
       // this.age=age;
   // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
