package Latihan1;

public class LaguAnakAyam {
    public static void main(String[] args) {
        int totalAyam = 10;

        System.out.println("Menggunakan for-loop:");
        for (int ayam = totalAyam; ayam > 0; ayam--) {
            System.out.println("Anak ayam turun " + ayam + ", mati satu tinggal " + (ayam - 1));
        }

        System.out.println("\nMenggunakan while-loop:");
        int ayam = totalAyam;
        while (ayam > 0) {
            System.out.println("Anak ayam turun " + ayam + ", mati satu tinggal " + (ayam - 1));
            ayam--;
        }

        System.out.println("\nMenggunakan do-while-loop:");
        ayam = totalAyam;
        do {
            System.out.println("Anak ayam turun " + ayam + ", mati satu tinggal " + (ayam - 1));
            ayam--;
        } while (ayam > 0);
    }
}