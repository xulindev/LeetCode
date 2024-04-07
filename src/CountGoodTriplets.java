public class CountGoodTriplets {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1, 9, 7};

        int result = compute(arr, 7, 2, 3);

        System.out.println(result);
    }

    /**
     * 题目：1534.统计好三元组
     * 地址：https://leetcode.cn/problems/count-good-triplets/description/
     * ------
     * 给你一个整数数组 arr ，以及 a、b 、c 三个整数。请你统计其中好三元组的数量。
     * 如果三元组 (arr[i], arr[j], arr[k]) 满足下列全部条件，则认为它是一个 好三元组 。
     * 0 <= i < j < k < arr.length
     * |arr[i] - arr[j]| <= a
     * |arr[j] - arr[k]| <= b
     * |arr[i] - arr[k]| <= c
     * 其中 |x| 表示 x 的绝对值。
     * @param arr 整数数组
     * @param a 整数数值
     * @param b 整数数值
     * @param c 整数数值
     * @return 好三元组的数量
     */
    private static int compute(int[] arr, int a, int b, int c) {
        int num = arr.length;
        int count = 0;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < num; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            ++count;
                        }
                    }
                }
            }
        }
        return count;
    }
}
