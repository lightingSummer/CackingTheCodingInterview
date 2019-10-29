package code;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/29 0029
 * @description：
 */
public class 加法运算替代 {
    public int calc(int a, int b, int type) {
        // write code here
        Compute compute = null;
        switch (type) {
            case 0:
                compute = new Div();
                break;
            case 1:
                compute = new Multi();
                break;
            case -1:
                compute = new Sub();
        }
        return compute == null ? -1 : compute.calculate(a, b);
    }

    private class Div implements Compute {
        @Override
        public int calculate(int a, int b) {
            int i = 0, res = b;
            while (res <= a) {
                res = res + b;
                i++;
            }
            return i;
        }
    }

    private class Multi implements Compute {
        @Override
        public int calculate(int a, int b) {
            int res = 0;
            for (int i = 0; i < b; i++) {
                res = res + a;
            }
            return res;
        }
    }

    private class Sub implements Compute {
        @Override
        public int calculate(int a, int b) {
            if (a >= b) {
                return count(a, b);
            } else {
                int count = count(b, a);
                int res = 0, step = -1;
                for (int i = 0; i < count; i++) {
                    res = res + step;
                }
                return res;
            }
        }

        private int count(int a, int b) {
            int i = 0;
            for (; i < a; i++) {
                if (i + b == a)
                    break;
            }
            return i;
        }
    }
}

interface Compute {
    int calculate(int a, int b);
}
