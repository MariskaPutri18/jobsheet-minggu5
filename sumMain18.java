import java.util.Scanner;

public class sumMain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("Program Menghitung Keuntungan Total Beberapa Perusahaan");
        System.out.print("Masukkan jumlah perusahaan : ");
        int perusahaan = sc.nextInt();

        System.out.print("Masukkan jumlah bulan : ");
        int bulan = sc.nextInt();

        double[][] keuntungan = new double[perusahaan][bulan];

        System.out.println("=========================================");
        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Perusahaan " + (i + 1));
            for (int j = 0; j <bulan; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " : ");
                keuntungan[i][j] = sc.nextDouble();
            }
        }

        System.out.println("=========================================");
        System.out.println("Total Keuntungan Setiap Perusahaan");
        for (int i = 0; i < perusahaan; i++) {
            double totalProfit = 0;
            for (int j = 0; j < bulan; j++) {
                totalProfit += keuntungan[i][j];
            }
            System.out.println("Perusahaan " + (i + 1) + ": " + String.format("%.2f", totalProfit));
        }

        System.out.println("=========================================");
        System.out.println("Total Keuntungan Semua Perusahaan");
        double totalAllCompanies = 0;
        for (int i = 0; i < perusahaan; i++) {
            for (int j = 0; j < bulan; j++) {
                totalAllCompanies += keuntungan[i][j];
            }
        }
        System.out.println("Total keuntungan semua perusahaan selama " +perusahaan + " bulan adalah = " + String.format("%.2f", totalAllCompanies));
    }
}
