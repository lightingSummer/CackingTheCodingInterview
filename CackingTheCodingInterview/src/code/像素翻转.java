package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/21 0021
 * @description：
 */
public class 像素翻转 {
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        for (int l = 0; l < mat.length / 2; l++) {
            int low = l, high = n - 1 - l;
            for (int i = low; i < high; i++) {
                int temp = mat[low][i];
                mat[low][i] = mat[n - 1 - i][low];
                mat[n - 1 - i][low] = mat[high][n - 1 - i];
                mat[high][n - 1 - i] = mat[i][high];
                mat[i][high] = temp;
            }
        }
        return mat;
    }
}
