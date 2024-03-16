import java.util.Scanner;

public class DcAkar18 {
    // Fungsi untuk menghitung akar dari suatu bilangan dengan metode divide and conquer
    public static int squareRoot(int bil) {
        if (bil == 0 || bil == 1) {
            return bil;
        }

        int kiri = 0;
        int kanan = bil;

        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;
            int nilaiTengah = tengah * tengah;

            if (nilaiTengah== bil) {
                return tengah;
            } else if (nilaiTengah < bil) {
                kiri = tengah+ 1;
            } else {
                kanan = tengah - 1;
            }
        }

        // Bulatkan ke bawah jika bilangan bukan kuadrat sempurna
        return kanan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bil = scanner.nextInt();

        int hasil = squareRoot(bil);
        System.out.println("Akar dari " + bil + " adalah: " + hasil);
    }
}