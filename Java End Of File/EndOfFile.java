import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int total = 0;
        int angka;

        while(scanner.hasNext()) {
            angka = scanner.nextInt();
            total += angka;
        }

        System.out.println("enter total : " + total);
        
    }
}