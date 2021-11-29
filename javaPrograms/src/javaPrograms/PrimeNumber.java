package javaPrograms;

public class PrimeNumber {
	public static void main(String args[]) {
		int num = 13;
		int start = 2;
		int stop = 22;
		boolean flag = false;
		for (int i = start; i < stop; i++) {
			for (int j = 2; j < stop / 2; j++) {
				if (j % i == 0) {
					flag = true;
					break;
				}

				if (flag) {
					System.out.println(j + "not a prime");
				} else
					System.out.println("is a prime");
			}
		}
	}

}
