import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите темпиратуру в Цельсиях   ");
        int TC=scan.nextInt();
        int TF=TC*(9/5)+32;
        System.out.println("Темпиратура по Фаренгейту равна: "+TF);
    }
}
