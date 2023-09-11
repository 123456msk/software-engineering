package software_engineering_1;

import java.util.ArrayList;
import java.util.List;

/*线性筛*/
public class Demo03_3 {
    public static void main(String[] args) {
        int n = 20000;
        List<Integer> primes = findPrimes(n);

        int count = 0;
        for (int prime : primes) {
            System.out.print(prime + " ");
            if (++ count % 5 == 0) {
                System.out.println();
            }
        }
    }

    public static List<Integer> findPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        boolean[] isComposite = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            if (!isComposite[i])  primes.add(i);

            for (int j = 0; j < primes.size() && i * primes.get(j) <= n; j++) {
                isComposite[i * primes.get(j)] = true;
                if (i % primes.get(j) == 0) {
                    break;
                }
            }
        }
        return primes;
    }
}