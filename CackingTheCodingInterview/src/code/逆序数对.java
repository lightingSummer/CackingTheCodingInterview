package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/27 0027
 * @description：
 */
public class 逆序数对 {
    public static void main(String[] args) {
        逆序数对 a = new 逆序数对();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 0};
        System.out.println(a.count(array, 8));
    }

    public int count(int[] A, int n) {
        // write code here
        sort(A, new int[n], 0, n - 1);
        return cnt;
    }

    private int cnt = 0;

    private void sort(int[] A, int[] copy, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        sort(A, copy, left, mid);
        sort(A, copy, mid + 1, right);
        merge(A, copy, left, mid, right);
    }

    private void merge(int[] A, int[] copy, int left, int mid, int right) {
        int l = left, r = mid + 1, t = 0;
        while (l <= mid && r <= right) {
            if (A[l] <= A[r]) {
                copy[t++] = A[l++];
            } else {
                cnt += mid - l + 1;
                copy[t++] = A[r++];
            }
        }
        while (l <= mid) {
            copy[t++] = A[l++];
        }
        while (r <= right) {
            copy[t++] = A[r++];
        }
        System.arraycopy(copy, 0, A, left, t);
    }
}
