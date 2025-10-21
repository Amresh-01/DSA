
Rain problem

import java.util.Scanner;

public class Rain_Problem {

    public static int trappedWater(int[] height) {
        int n = height.length;

        if (n == 0) {
            return 0;
        }

        int[] leftMax = new int[n];
        int[] RightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        RightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(RightMax[i + 1], height[i]);
        }

        int trapped = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftMax[i], RightMax[i]);
            trapped += waterlevel - height[i];
        }
        return trapped;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println("Trapped Water: " + trappedWater(height));
    }
}
