import java.util.Scanner;
public class mainPangkat18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : " );
        int elemen = sc.nextInt();

        pangkat18 [] png = new pangkat18[elemen];

        for (int i = 0; i < elemen; i++){
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat18(nilai, pangkat);
        }
        boolean ulang = true;
        while (ulang) {
            
        
        System.out.println("======ALGORITMA UNTUK MENGHITUNG=====");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.println("3. Keluar");
        System.out.println("=====================================");
        System.out.println("Masukkan Pilihan : ");
        int Pilihan = sc.nextInt();
        switch (Pilihan) {
            case 1:
                System.out.println("==========================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                    for (int i = 0; i < elemen; i++) {
                     System.out.println("Nilai "+ png[i].nilai+" pangkat " +png[i].pangkat +" adalah "+ png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                    }   
                break;
            case 2:
                System.out.println("==========================================");
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai "+ png[i].nilai+" pangkat "+ png[i].pangkat +" adalah "+ png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                } 
                break;
            case 3:
                 ulang = false;
                System.out.println(" anda keluar dari program");
                break;
            default:
                System.out.println("Pilihan Tidak valid");
                break;
        }
    }
    }
}
