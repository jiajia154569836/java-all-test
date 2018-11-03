package suanfa.sanjiaoxing;


import entity.Lseg;
import entity.Point;

public class CrossPoint {


    // 1、判断斜率相同不，y2-y1/x2-x1,y4-y3/x4-x3,相同则无交点，不相同说明直线有交点则执行第二步； 
    // 2、设y=ax+b,通过斜率可求出a的值，通过坐标可以求出b的值，这样两个线段所在直线的两个方程式就得到了； 
    // 3、通过两个方程式求出交点，再判断交点是不是落在两线段交点的区域中
    public static Point getCrossPoint(Lseg lsegA, Lseg lsegB) {
        float x;
        float y;
        float x1 = lsegA.getA().getX();
        float y1 = lsegA.getA().getY();
        float x2 = lsegA.getB().getX();
        float y2 = lsegA.getB().getY();
        float x3 = lsegB.getA().getX();
        float y3 = lsegB.getA().getY();
        float x4 = lsegB.getB().getX();
        float y4 = lsegB.getB().getY();
        float k1 = Float.MAX_VALUE;
        float k2 = Float.MAX_VALUE;
        boolean flag1 = false;
        boolean flag2 = false;
        if ((x1 - x2) == 0)
            flag1 = true;
        if ((x3 - x4) == 0)
            flag2 = true;
        if (!flag1)
            k1 = (y1 - y2) / (x1 - x2);
        if (!flag2)
            k2 = (y3 - y4) / (x3 - x4);
        if (k1 == k2) return null;
        if (flag1) {
            if (flag2)
                return null;
            x = x1;
            if (k2 == 0) {
                y = y3;
            } else {
                y = k2 * (x - x4) + y4;
            }
        } else if (flag2) {
            x = x3;
            if (k1 == 0) {
                y = y1;
            } else {
                y = k1 * (x - x2) + y2;
            }
        } else {
            if (k1 == 0) {
                y = y1;
                x = (y - y4) / k2 + x4;
            } else if (k2 == 0) {
                y = y3;
                x = (y - y2) / k1 + x2;
            } else {
                x = (k1 * x2 - k2 * x4 + y4 - y2) / (k1 - k2);
                y = k1 * (x - x2) + y2;
            }
        }
        if (between(x1, x2, x) && between(y1, y2, y) && between(x3, x4, x) && between(y3, y4, y)) {
            Point point = new Point();
            point.setX(x);
            point.setY(y);
            if (point.equals(lsegA.getA()) || point.equals(lsegA.getB()))
                return null;
            return point;
        } else {
            return null;
        }
    }

    //判断交点是否在线上
    public static boolean between(float a, float b, float target) {
        if (target >= a - 0.01 && target <= b + 0.01 || target <= a + 0.01 && target >= b - 0.01)
            return true;
        else
            return false;
    }


    //判断三点是否相互连线且共线
    public static boolean threePointCollinear(Point p1, Point p2, Point p3) {
        boolean flag = false;
        float k1 = 0.0f;//斜率
        float k2 = 0.0f;//斜率
        //1、两点共点（p1与p2共点，p1与p3共点，p2与p3共点）
        if ((p1.getX() == p2.getX() && p1.getY() == p2.getY()) || (p1.getX() == p3.getX() && p1.getY() == p3.getY()) || (p2.getX() == p3.getX() && p2.getY() == p3.getY())) {
            flag = true;
            return flag;
        }
        //2、三点纵坐标相等，横坐标不相等
        if ((p1.getY() == p2.getY()) && (p1.getY() == p3.getY()) && (p1.getX() != p2.getX()) && (p1.getX() != p3.getX())) {
            flag = true;
            return flag;
        }
        //3、三点横坐标相等，且纵坐标不相等
        if ((p1.getX() == p2.getX()) && (p1.getX() == p3.getX()) && (p1.getY() != p2.getY()) && (p1.getY() != p3.getY())) {
            flag = true;
            return flag;
        } else {
            //横坐标不相等则不存在除数为0问题
            k1 = (p3.getY() - p2.getY()) / (p3.getX() - p2.getX());
            k2 = (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
            if (k1 == k2) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }


}

