import java.util.Scanner;

public class mainakar18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        double bilangan = sc.nextDouble();

        akar18 akar = new akar18(bilangan);

    
        int akarBF = akar.akarBruteForce();
        if (akarBF == -1) {
            System.out.println("Bilangan " + bilangan + " bukan kuadrat sempurna.");
        } else {
            System.out.println("Akar bilangan " + bilangan + " (Brute Force): " + akarBF);
        }

        int akarDC = akar.akarDivideConquer(1, (int) Math.sqrt(bilangan));
        if (akarDC == -1) {
            System.out.println("Bilangan " + bilangan + " bukan kuadrat sempurna.");
        } else {
            System.out.println("Akar bilangan " + bilangan + " (Divide and Conquer): " + akarDC);
        }
    }
}
