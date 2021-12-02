import java.util.Scanner;


public class MinMax {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("masukkan n: ");
		int n = scanner.nextInt();

		int[] data = new int[n];

		for(var i = 0; i < data.length; i++) {
			data[i] = angkaAcak(1, 100);
		}

		// menampilkan data array
		System.out.print("\ndata: ");
		for(var d : data) {
			System.out.print(d + " ");
		}

		// tampikan bilangan minimum maksimum
		System.out.println("\n\nminimum  : " + minimum(data));
		System.out.println("maksimum :" + maksimal(data));

	}

	// fungsi mencari bilangan minimum dari array data
	static private int minimum(int... arr) {
		int min = Integer.MAX_VALUE;

		for(var sm : arr) {
			min = Math.min(min, sm);
		}

		return min;
	}
	
	// fungsi mencari bilangan maksimal dari array data
	static private int maksimal(int... arr) {
		int maks = Integer.MIN_VALUE;

		for(var sm : arr) {
			maks = Math.max(maks, sm);
		}

		return maks;
	}
	
	// fungsi membangkitkan angka random
	static private int angkaAcak(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

}
