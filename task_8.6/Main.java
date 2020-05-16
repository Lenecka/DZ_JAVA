/*Задача 8.6
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла: ");
        String name=reader.readLine();
        String pathToFile="/Users/temp/Desktop/test/" + name;
        //String name=reader.readLine();
        System.out.println("Введите числа: ");
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(pathToFile)));
        ArrayList<Integer> nums=new ArrayList<Integer>(8);
        ArrayList<Integer> nums2=new ArrayList<Integer>();
       // ArrayList<Integer> nums3=new ArrayList<Integer>();
        int num;
        for(int i=0;i<8;i++){
            num = Integer.parseInt(reader.readLine().trim());
            nums.add(num);
            if(num%2==0)
                nums2.add(num);
       // while((line=reader2.readLine())!=null){
            //nums.add(Integer.parseInt(i));
        }
        System.out.println(nums);
        System.out.println(nums2);
            Collections.sort(nums2);
               // nums3.add(num);
        for (int i : nums2) {
            System.out.println(i);
        }
    }
}
