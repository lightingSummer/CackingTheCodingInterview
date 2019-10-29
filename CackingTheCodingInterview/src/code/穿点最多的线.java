package code;

import java.util.HashMap;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/29 0029
 * @description：
 */
public class 穿点最多的线 {
    public double[] getLine(Point[] p, int n) {
        // write code here
        HashMap<Line, Integer> lineNum = new HashMap<Line, Integer>();
        int max = 0;
        double slope = Double.POSITIVE_INFINITY, intercept = 0;
        //把所有线取出来求出斜率和截距,并用哈希图存储下线条和个数的键值对
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double k = (double) (p[j].y - p[i].y) / (p[j].x - p[i].x);
                double b = p[i].y - k * p[i].x;
                Line line = new Line(k, b);
                if (lineNum.containsKey(line)) {
                    int num = lineNum.get(line) + 1;
                    lineNum.put(line, num);
                    //不断调整最大值
                    if (num > max) {
                        max = num;
                        slope = k;
                        intercept = b;
                    }
                } else
                    lineNum.put(line, 1);
            }
        }
        return new double[]{slope, intercept};
    }
}

class Line {
    double k;  //斜率
    double b;  //截距
    double epsilon = 0.0001; //误差

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    //比较两个double是否相等
    public boolean isEqualValue(double a, double b) {
        return (Math.abs(a - b) < epsilon);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Line) {
            if (isEqualValue(k, ((Line) obj).k) && isEqualValue(b, ((Line) obj).b))
                return true;
            return false;
        }
        return super.equals(obj);
    }

    //HashMap对应的应该是HashSet，数据结构是哈希表，先比hashCode()，再比equals
    @Override
    public int hashCode() {
        String str = k + " " + b;
        return str.hashCode();
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }
}
