public class akar18 {

    private double bilangan;

    public akar18(double bilangan) {
        this.bilangan = bilangan;
    }

    public double getBilangan() {
        return bilangan;
    }

    public int akarBruteForce() {
        for (int i = 1; i <= bilangan; i++) {
            if (i * i == bilangan) {
                return i;
            }
        }
        return -1;
    }

    public int akarDivideConquer(int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (mid * mid == bilangan) {
            return mid;
        } else if (mid * mid < bilangan) {
            return akarDivideConquer(mid + 1, high);
        } else {
            return akarDivideConquer(low, mid - 1);
        }
    }
}
