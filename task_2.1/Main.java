public class Main {
    public static void main(String[] args) {
        int[] mas = {8, 3, 5, 6, 3, 8, 6, 9, 4, 5};
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += mas[i];
        }
        System.out.println(sum / 10);
    }
}
