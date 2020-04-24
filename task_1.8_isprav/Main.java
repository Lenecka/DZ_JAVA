import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите темпиратуру в Цельсиях   ");
        double TC=scan.nextDouble();
        double TF=TC*(9.0/5.0)+32;
        System.out.println("Темпиратура по Фаренгейту равна: "+TF);
    }
}
