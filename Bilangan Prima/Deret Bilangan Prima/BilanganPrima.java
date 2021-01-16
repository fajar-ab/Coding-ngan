import java.util.Scanner;

class BilanganPrima {

    public static void main(String[] args){
    	Scanner userIn = new Scanner(System.in);

    	System.out.print("Input n : ");
    	int n = userIn.nextInt();

    	for (int i = 2; i <= n; i++) {
    		int k = 0;
    		for(int j = 1; j <= i; j++) {
    			if(i % j == 0) {
    				k++;
    			}
    		}

    		if(k == 2) {
    			System.out.print(i + " ");
    		}
    	}
    }
}