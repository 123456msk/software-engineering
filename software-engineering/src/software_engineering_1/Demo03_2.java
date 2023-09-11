package software_engineering_1;


/*埃式筛*/
public class Demo03_2 {
    public static void main(String[] args) {
        int n = 20000;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        check(isPrime, n);

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                if (++ cnt % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static void check(boolean[] isPrime, int n) {
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}