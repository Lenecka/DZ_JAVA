import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Задача 5.5
        /* Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
*
* Примечание:
* Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
*
* Пример вывода:
* Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
* Имя: Катя, пол: женский, возраст: 55
* Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...
        public class Main {
            public static void main(String[] args) {
              */
        Human frosa = new Human("Frosa", false, 60, null, null);
        Human goga = new Human("Goga", true, 64, null, null);
        Human ura = new Human("Ura", true,39, frosa, goga);
        Human zina = new Human("Zina", false, 62, null, null);
        Human peta = new Human("Peta", true, 61, null, null);
        Human nina = new Human("Nina",false, 36, zina, peta);
        Human vika = new Human("Vika", false, 3, nina, ura);
        Human kola = new Human("Kola", true, 6, nina, ura);
        Human shasha = new Human("Shasha", true, 12, nina, ura);
        System.out.println(frosa.toString());
        System.out.println(goga.toString());
        System.out.println(ura.toString());
        System.out.println(zina.toString());
        System.out.println(peta.toString());
        System.out.println(nina.toString());
        System.out.println(vika.toString());
        System.out.println(kola.toString());
        System.out.println(shasha.toString());
    }

public static class Human {
    private String name;
    private boolean sex;
    private int age;
    private Human father;
    private  Human mother;
    public Human(String name, boolean sex,int age,Human father,Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public String toString() {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        if (this.father != null) {
            text += ", отец: " + this.father.name;
        }

        if (this.mother != null) {
            text += ", мать: " + this.mother.name;
        }

        return text;
    }
}
}
