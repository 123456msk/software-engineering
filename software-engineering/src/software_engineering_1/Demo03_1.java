package software_engineering_1;


/*要求：输出1~20000内的所有素数，按每行5个打印出来，并分析程序中最费时的函数是什么， 如何改进？*/

/*普通做法*/
public class Demo03_1 {
    public static void main(String[] args) {
        int cnt = 0;
        for (int n = 2; n <= 20000; n++) {
            if (isPrime(n)) {
                if (cnt++ % 5 == 0) {
                    System.out.println();
                }
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
