package suanfa.sanjiaoxing;

import entity.Lseg;
import entity.Point;

import java.util.*;
import java.util.stream.Collectors;

public class TriangleNum {

    //1.随机生成18个数等于9个点
    //2.9个点两两组合生成线
    //3.求每条线的交点
    //4.将所有的点每三组（3点必须相互连线）比较根据三点不共线可得三角形

    public static void main(String arg[]) {
        int sum = 0;
        Random rand = new Random();
        List<Point> listAllPoint = new ArrayList<Point>();
        List<Point> listPoint = new ArrayList<Point>();
        List<Lseg> listLseg = new ArrayList<Lseg>();
        //随机生成9个点
        for(int i=0;i<9;i++) {
            Point point = new Point();
            point.setX(rand.nextFloat() * 100);
            point.setY(rand.nextFloat() * 100);
            listPoint.add(point);
        }
        //测试3点三角形和4个点正方形
//        Point point1 = new Point();
//        point1.setX(1);
//        point1.setY(1);
//        listPoint.add(point1);
//        Point point2 = new Point();
//        point2.setX(1);
//        point2.setY(2);
//        listPoint.add(point2);
//        Point point3 = new Point();
//        point3.setX(2);
//        point3.setY(1);
//        listPoint.add(point3);
//        Point point4 = new Point();
//        point4.setX(2);
//        point4.setY(2);
//        listPoint.add(point4);

        //去重点
        List<Point> listPoints = listPoint.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < listPoints.size(); i++) {
            for (int j = i+1; j < listPoints.size(); j++) {
                Lseg lseg = new Lseg();
                lseg.setA(listPoints.get(i));
                lseg.setB(listPoints.get(j));
                listLseg.add(lseg);
            }
        }
        //去重线
        List<Lseg> listLsegs = listLseg.stream().distinct().collect(Collectors.toList());

        for (int i = 0; i < listLsegs.size(); i++) {

            for (int j = i; j < listLsegs.size(); j++) {
                Lseg a = listLsegs.get(i);
                Lseg b = listLsegs.get(j);
                //得到交点
                if (CrossPoint.getCrossPoint(a, b) != null) {
                    listAllPoint.add(CrossPoint.getCrossPoint(a, b));
                }
            }
        }
        //加入原来的9个点
        for (Point point : listPoints) {
            listAllPoint.add(point);
        }
        //去重
        listAllPoint = listAllPoint.stream().distinct().collect(Collectors.toList());
        for (int k = 0; k < listAllPoint.size(); k++) {
            for (int i = k + 1; i < listAllPoint.size(); i++) {
                for (int j = i + 1; j < listAllPoint.size(); j++) {
                    //判断三点是否相互连线且共线
                    Boolean flag = CrossPoint.threePointCollinear(listAllPoint.get(k), listAllPoint.get(i), listAllPoint.get(j));
                    if (flag == false) {
                        sum = sum + 1;
                    }

                }
            }
        }
        System.out.println("共有三角形个数:" + sum);
    }
}
