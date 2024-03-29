import java.util.Scanner;
public class MainFaktorial18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial18 [] fk = new Faktorial18[elemen];
        for (int i = 0; i < elemen; i++){
            fk[i] = new Faktorial18();
            System.out.print("Masukkan nilai data ke-"+ (i +1)+ " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++){
            long startTime = System.currentTimeMillis();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Waktu eksekusi: " + executionTime + " ms");
        }
        System.out.println("================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++){
            long startTime = System.currentTimeMillis();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Waktu eksekusi: " + executionTime + " ms");
        }
        System.out.println("===================================================");

    }
}

