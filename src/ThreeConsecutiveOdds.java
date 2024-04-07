public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 3, 4, 2, 7, 23, 11};

        boolean result = compute(arr);

        System.out.print(result);
    }

    /**
     * 题目：1550.存在连续三个奇数数组
     * 地址：https://leetcode.cn/problems/three-consecutive-odds/
     * @param arr 整数数组
     * @return 请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
     */
    private static boolean compute(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] & 1) == 1 && (arr[i + 1] & 1) == 1 && (arr[i + 2] & 1) == 1) {
                return true;
            }
        }
        return false;
    }
}
