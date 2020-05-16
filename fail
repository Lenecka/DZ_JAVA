/*Задача 8.5
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего читать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
•	Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter после использования.
•	Метод main не должен выводить данные на экран.
*/

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        /*   *****создание папки****
        FileWriter file1 = new FileWriter("/Users/temp/Desktop/test" "Hello"); // напишите тут ваш код
       // boolean created = file1.mkdir();
        //if(created)
         //   System.out.println("Folder has been created");*/
        //создаем документ txt
//                ****создание документа****
        // получаем разделитель пути в текущей операционной системе
        //String fileSeparator = System.getProperty("file.separator");

        //создаем абсолютный путь к файлу
        //String absoluteFilePath = fileSeparator + "Users" + fileSeparator + "temp" + fileSeparator + "Desktop" + fileSeparator + "test" + fileSeparator + "Hello.txt";

        //File file = new File(absoluteFilePath);
        //if (file.createNewFile()) {
           // System.out.println(absoluteFilePath + " Файл создан");
       // } else {
       //     System.out.println("Файл " + absoluteFilePath + " уже существует");
        //}
//Оборачивая System.in (стандартный поток ввода) в InputStreamReader, который обернут в BufferedReader , мы можем прочитать ввод от пользователя в командной строке
// метод readLine () считывает строку текста из командной строки.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("Введите имя файла: ");
        //String name=reader.readLine();
        //String pathToFile="/Users/temp/Desktop/test/" + name;
       // System.out.println("Имя файла: " + name);
//имя файла прочитали и вывели на экран
        System.out.println("Введите текст. Для выхода введите:  exit");
        //BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        String stroka="";
       // BufferedWriter bWriter = new BufferedWriter(new FileWriter(pathToFile)); //запись в файл
        String line;
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(reader.readLine())); //запись в файл
        do {
            line = reader.readLine();
            bWriter.write(line);

            //line = "\n";
            //bWriter.write(stroka);
        }while (!reader.readLine().equals("exit"));
        //bWriter.write(stroka);
        //BufferedWriter bWriter = new BufferedWriter(new FileWriter(pathToFile));
        // String line=reader.readLine();
        // stroka+=line;
        // stroka+="\n";
        bWriter.close();
    }
}
