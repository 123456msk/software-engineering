package 软件工程第一次作业;

public class Demo02 {
    public static void main(String[] args) {
        int[] a = {1, -2, 3, 5, -1};
        int max = -0x3f3f3f3f;
        for (int i = 0;i < a.length;i ++){
            if(max < a[i]) max = a[i];
        }
        System.out.println(max);
    }
}
