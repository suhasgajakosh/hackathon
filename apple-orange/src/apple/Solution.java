package apple;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int x = 0;
        int y = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
        	
            apple[apple_i] = in.nextInt();
            if (s <= a + apple[apple_i] && a + apple[apple_i] <= t) {
                x ++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if (s <= b + orange[orange_i] && b + orange[orange_i] <= t) {
                y ++;
            }
        }
        System.out.println(x);
        System.out.println(y);
        
    }
}