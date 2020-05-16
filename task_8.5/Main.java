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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст. Для выхода введите:  exit");
        // stroka="";
        String line;
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(reader.readLine())); //запись в файл
        while (true)
        {
            line=reader.readLine();
            //bWriter.write(line+"\n");
            if(line.equals("exit")){
                bWriter.write(line+"\n");
                break;
            }
            else{
                bWriter.write(line+"\n");
            }
        }
        bWriter.close();
    }
}
