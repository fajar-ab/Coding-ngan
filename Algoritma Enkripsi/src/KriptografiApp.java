import java.util.Scanner;

public class KriptografiApp {

    static void enkripsi() {
        Scanner userIn = new Scanner(System.in);

        System.out.print(" Masukkan pesan : ");
        String pesan = userIn.nextLine();
        System.out.print(" Masukkan Kunci : ");
        int kunci = userIn.nextInt();

        char[] karakter = pesan.toCharArray();
        System.out.print("\n Hasil enkripsi : ");
        for(char c : karakter) { 
            c += kunci;
            System.out.print(c);
        }
        System.out.println();
    }

    static void dekripsi() {
        Scanner userIn = new Scanner(System.in);

        System.out.print(" Masukkan pesan : ");
        String pesan = userIn.nextLine();
        System.out.print(" Masukkan kunci : ");
        int kunci = userIn.nextInt();

        char[] karakter = pesan.toCharArray();
        System.out.print("\n Hasil dekripsi : ");
        for(char c : karakter) { 
            c -= kunci;
            System.out.print(c);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) throws Exception {
        
        System.out.println("\n| PROGRAM KRIPTOGRAFI JAVA");

        System.out.println("\n--\nEnkripsi\n");
        enkripsi();

        System.out.println("\n--\nEnkripsi\n");
        dekripsi();

    }
}
