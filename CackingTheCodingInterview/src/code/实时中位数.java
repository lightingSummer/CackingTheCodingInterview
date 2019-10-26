package code;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/26 0026
 * @description：
 */
public class 实时中位数 {
    public static void main(String[] args) {
        int[] array = new int[]{212790};
        System.out.println(Arrays.toString(getMiddle(array, array.length)));
    }

    public static int[] getMiddle(int[] A, int n) {
        // write code here
        int[] res = new int[n];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(n / 2 + 1, (o1, o2) -> o2 - o1);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(n / 2 + 1);
        for (int i = 0; i < n; i++) {
            int val = A[i];
            if (maxHeap.isEmpty()) {
                maxHeap.offer(val);
            } else if (i % 2 == 0) {
                if (!minHeap.isEmpty() && minHeap.peek() < val) {
                    minHeap.offer(val);
                    val = minHeap.poll();
                }
                maxHeap.offer(val);
            } else if (i % 2 == 1) {
                if (!maxHeap.isEmpty() && maxHeap.peek() > val) {
                    maxHeap.offer(val);
                    val = maxHeap.poll();
                }
                minHeap.offer(val);
            }
            res[i] = maxHeap.peek();
        }
        return res;
    }
}
