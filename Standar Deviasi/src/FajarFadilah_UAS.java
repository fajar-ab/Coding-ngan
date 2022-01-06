import java.io.Console;
import java.util.Random;

public class FajarFadilah_UAS {
    public static void main(String[] args) {

        Console console = System.console();

        System.out.print("Berapa jumlah data : ");
        int n = Integer.parseInt(console.readLine());

        double[] data = new double[n];

        for (var i = 0; i < n; i++) {
            data[i] = angkaRandom();
            console.format(" Data[%2d] : %.4f\n", (i+1), data[i]);
        }
        
        System.out.println();
        console.format("Rata-rata        : %.4f\n", rataRata(data));
        console.format("Jumlah (xi..xn)2 : %.4f\n", nilaiX(data));
        console.format("Standar Deviasi  : %.4f\n", standarDeviasi(data));
    }

    // membangkitkan angka randon
    private static double angkaRandom() {
        Random random = new Random();
        return random.nextDouble(1, 101);
    }

    // mencari rata rata
    private static double rataRata(double[] data) {
        double total = 0;

        for (double v : data) {
            total += v;
        }

        return (double)(total / data.length); 
    }

    // mencari nilai xi.. xn
    private static double nilaiX(double[] data) {
        double totalX = 0;

        for (double v : data) {
            totalX = Math.pow((v - rataRata(data)), 2);
        }

        return totalX;
    }

    // rumus
    private static double standarDeviasi(double[] data) {
        double a = (double) 1 / (data.length - 1);
        double sd = a * nilaiX(data);
        return Math.sqrt(sd);
    }
}