package software_engineering_1;

import java.util.Scanner;

import static java.lang.Math.max;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i ++) nums[i] = scanner.nextInt();

        int mx = nums[0],s = 0;
        for(int i = 0;i < n;i ++){
            s = max(s + nums[i],nums[i]);
            mx = max(mx,s);
        }
        System.out.println(mx);
    }
}
