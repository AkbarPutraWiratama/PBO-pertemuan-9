package Latihan1;

public class BilanganPrima {
	 public static void main(String[] args) {
		 
	        int start = 0;
	        int end = 20;
	        System.out.println("Menggunakan for-loop:");
	        System.out.print("Bilangan Prima: ");
	        for (int num = start; num <= end; num++) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	        System.out.print("\nBilangan Bukan Prima: ");
	        for (int num = start; num <= end; num++) {
	            if (!isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }

	        System.out.println("\n\nMenggunakan while-loop:");
	        System.out.print("Bilangan Prima: ");
	        int num = start;
	        while (num <= end) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	            num++;
	        }
	        System.out.print("\nBilangan Bukan Prima: ");
	        num = start;
	        while (num <= end) {
	            if (!isPrime(num)) {
	                System.out.print(num + " ");
	            }
	            num++;
	        }

	        System.out.println("\n\nMenggunakan do-while-loop:");
	        System.out.print("Bilangan Prima: ");
	        num = start;
	        do {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	            num++;
	        } while (num <= end);

	        System.out.print("\nBilangan Bukan Prima: ");
	        num = start;
	        do {
	            if (!isPrime(num)) {
	                System.out.print(num + " ");
	            }
	            num++;
	        } while (num <= end);
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; 
	            }
	        }
	        return true;
	    }
	}