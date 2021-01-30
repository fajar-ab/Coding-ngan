class Faktorial {

	public static void main(String[] args) {
		
		System.out.println(faktorial(5));
	}

	private static int faktorial(int n) {
		if(n == 1 || n == 0)
			return 1;
		else if(n < 0)
			System.out.println();
		else
			return n * faktorial(n - 1);

		return 0;
	}
}