import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] result = compute(matrix);

        System.out.print(Arrays.deepToString(result));
    }

    /**
     * 题目：867.转置矩阵
     * <br/>
     * 地址：https://leetcode.cn/problems/transpose-matrix/description/
     * <p/>
     * 给你一个二维整数数组 matrix， 返回 matrix 的 转置矩阵 。
     * 矩阵的 转置 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
     *
     * @param matrix 二维整数数组矩阵
     * @return 二维整数数组转置矩阵
     */
    public static int[][] compute(int[][] matrix) {
        // 取得当前矩阵的行数
        int row = matrix.length;
        // 取得当前矩阵的列数
        int column = matrix[0].length;
        // 矩阵转置后，新的矩阵行数为旧的矩阵列数，新的矩阵列数为旧的矩阵行数。
        int[][] transposed = new int[column][row];
        // 新旧矩阵数据交换
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
