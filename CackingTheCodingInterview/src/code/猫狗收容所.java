package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/22 0022
 * @description：
 */
public class 猫狗收容所 {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        Queue<Integer> dog = new LinkedList<Integer>();
        Queue<Integer> cat = new LinkedList<Integer>();
        Queue<Integer> all = new LinkedList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < ope.length; i++) {
            if (ope[i][0] == 1) {
                int animalNum = ope[i][1];
                if (animalNum > 0) {
                    dog.offer(animalNum);
                    all.offer(animalNum);
                } else if (animalNum < 0) {
                    cat.offer(animalNum);
                    all.offer(animalNum);
                }
            } else if (ope[i][0] == 2) {
                switch (ope[i][1]) {
                    case 0:
                        if (!all.isEmpty()) {
                            int val = all.poll();
                            if (val < 0) {
                                cat.poll();
                            } else {
                                dog.poll();
                            }
                            res.add(val);
                        }
                        break;
                    case 1:
                        if (!dog.isEmpty()) {
                            int temp = dog.poll();
                            res.add(temp);
                            all.remove(temp);
                        }
                        break;
                    case -1:
                        if (!cat.isEmpty()) {
                            int temp = cat.poll();
                            res.add(temp);
                            all.remove(temp);
                        }
                }
            }
        }
        return res;
    }
}
