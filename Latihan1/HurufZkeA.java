package Latihan1;

public class HurufZkeA {
	public static void main(String[] args) {
        System.out.println("Menggunakan for-loop:");
        for (char letter = 'Z'; letter >= 'A'; letter--) {
            System.out.print(letter + " ");
        }

        System.out.println("\n\nMenggunakan while-loop:");
        char letter = 'Z';
        while (letter >= 'A') {
            System.out.print(letter + " ");
            letter--;
        }

        System.out.println("\n\nMenggunakan do-while-loop:");
        letter = 'Z';
        do {
            System.out.print(letter + " ");
            letter--;
        } while (letter >= 'A');
    }
}