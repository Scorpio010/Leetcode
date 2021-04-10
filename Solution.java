package leetcode.p976;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] num) {
        Arrays.sort(num);
        for (int i = num.length - 1; i >= 2; i--) {
            if (num[i] < num[i - 1] + num[i - 2]) return num[i]+num[i-1]+num[i-2];
        }return 0;
    }

}
