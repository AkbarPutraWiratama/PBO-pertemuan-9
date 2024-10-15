package Latihan1;

public class BilanganGenap {
	 public static void main(String[] args) {
	        int start = 0;
	        int end = 20;

	        System.out.println("Menggunakan for-loop:");
	        System.out.print("Bilangan Genap: ");
	        for (int num = start; num <= end; num++) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	        }
	        System.out.print("\nBilangan Ganjil: ");
	        for (int num = start; num <= end; num++) {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	        }

	        System.out.println("\n\nMenggunakan while-loop:");
	        System.out.print("Bilangan Genap: ");
	        int num = start;
	        while (num <= end) {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	            num++;
	        }
	        System.out.print("\nBilangan Ganjil: ");
	        num = start;
	        while (num <= end) {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	            num++;
	        }

	        System.out.println("\n\nMenggunakan do-while-loop:");
	        System.out.print("Bilangan Genap: ");
	        num = start;
	        do {
	            if (num % 2 == 0) {
	                System.out.print(num + " ");
	            }
	            num++;
	        } while (num <= end);

	        System.out.print("\nBilangan Ganjil: ");
	        num = start;
	        do {
	            if (num % 2 != 0) {
	                System.out.print(num + " ");
	            }
	            num++;
	        } while (num <= end);
	    }
	}