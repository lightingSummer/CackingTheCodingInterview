package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/21 0021
 * @description：
 */
public class 清除行列 {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        boolean clearFirstRow = false, clearFirstColumn = false;
        for (int i = 0; i < n; i++) {
            if (!clearFirstRow && mat[0][i] == 0) {
                clearFirstRow = true;
            }
            if (!clearFirstColumn && mat[i][0] == 0) {
                clearFirstColumn = true;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][j] == 0) {
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            if (mat[0][j] == 0) {
                for (int i = 1; i < n; i++) {
                    mat[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (mat[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    mat[i][j] = 0;
                }
            }
        }
        if (clearFirstRow) {
            for (int i = 0; i < n; i++) {
                mat[0][i] = 0;
            }
        }
        if (clearFirstColumn) {
            for (int i = 0; i < n; i++) {
                mat[i][0] = 0;
            }
        }
        return mat;
    }
}
