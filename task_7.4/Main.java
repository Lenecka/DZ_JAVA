/*Задача 7.4
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat. */
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ввести с дату в формате: 2013-08-18   ");
        String date = scan.nextLine();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date y=format.parse(date);
        SimpleDateFormat a=new SimpleDateFormat("MMM dd,yyyy");
        //format.applyLocalizedPattern("dd.MM.yyyy");
        //getDayOfYear
        System.out.print(a.format(y).toUpperCase());

    }
}

