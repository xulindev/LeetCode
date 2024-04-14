public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        int result = compute(matrix);

        System.out.print(result);
    }

    /**
     * 题目：1572.矩阵对角线元素的和
     * <br/>
     * 地址：https://leetcode.cn/problems/matrix-diagonal-sum/description/
     * <p/>
     * 给你一个正方形矩阵 matrix，请你返回矩阵对角线元素的和。
     * 请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
     *
     * @param matrix 二维整数数组矩阵
     * @return 矩阵对角线元素的和
     */
    public static int compute(int[][] matrix) {
        // 矩阵已经固定位正方形，取得行数就行。
        int row = matrix.length;
        // 取矩阵的中心点坐标
        int middle = row / 2;
        // 缓存矩阵对角线元素的和
        int sum = 0;
        // matrix[i][i]取右下对角的值，matrix[i][row - 1 - i]取右上对角线的值。
        for (int i = 0; i < row; ++i) {
            sum += matrix[i][i] + matrix[i][row - 1 - i];
        }
        // 如果矩阵行数是奇数，那么两条对角线会交叉，交叉的那个值减掉。
        return sum - matrix[middle][middle] * (row & 1);
    }
}
