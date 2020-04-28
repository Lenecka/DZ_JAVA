import java.util.*;
public class Main {
    public static void main(String[] args) {
       /*Задача 4.4
            Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
            -----
            Подсказка: их 6 штук.
            Каждую комбинацию вывести с новой строки. Слова не разделять.
            ----------
            Пример:
            МылаРамуМама
            РамуМамаМыла
            ...
        */
        String stroka[] = new String[3];
        stroka[0] = "Мама";
        stroka[1] = "Мыла";
        stroka[2] = "Раму";

        for (int i = 0;i<stroka.length;i++)
        {
            for (int j = 0; j<stroka.length;j++)
            {
                for (int k = 0; k<stroka.length;k++)
                {
                    if (i != j && i != k && j != k)
                        System.out.println(stroka[i] + stroka[j] + stroka[k]);
                }
            }
        }
    }
}
