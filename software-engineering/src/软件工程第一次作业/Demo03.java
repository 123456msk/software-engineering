package 软件工程第一次作业;


/*要求：输出1~20000内的所有素数，按每行5个打印出来，并分析程序中最费时的函数是什么， 如何改进？*/

public class Demo03 {
    public static void main(String[] args) {
        int cnt = 0;
        for(int n = 2;n <= 20000;n ++){
            int i;
            for(i = 2;i < n;i ++){
                if(n % i == 0) break;
            }
            if(i == n) {
                if(cnt ++  % 5 == 0) System.out.println();
                System.out.print(n + " ");
            }
        }
    }
}
