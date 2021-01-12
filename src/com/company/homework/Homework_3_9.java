package com.company.homework;

import com.company.util.ConsoleUtil;

public class Homework_3_9 {

    public static void main(String[] args) {

        class Point{
            float x, y;
            Point(){}

            public float distance(Point other){
                return (float) Math.sqrt((x - other.x)*(x - other.x) + (y - other.y)*(y-other.y));
            }

            public float distanceSquare(Point other){
                return (x - other.x)*(x - other.x) + (y - other.y)*(y-other.y);
            }

            public float triangleArea(Point b, Point c){
                return Math.abs(((b.x - x)*(c.y - y) - (c.x - x)*(b.y - y))/2);
            }
        }

        Point a = new Point();
        Point b = new Point();
        Point c = new Point();

        a.x = ConsoleUtil.inputFloat("a.x");
        a.y = ConsoleUtil.inputFloat("a.y");
        b.x = ConsoleUtil.inputFloat("b.x");
        b.y = ConsoleUtil.inputFloat("b.y");
        c.x = ConsoleUtil.inputFloat("c.x");
        c.y = ConsoleUtil.inputFloat("c.y");

        float ab = a.distance(b);
        float bc = b.distance(c);
        float ca = c.distance(a);

        if (ab + bc <= ca || bc + ca <= ab || ca + ab <= bc){
            System.out.println("3 diem khong tao thanh mot tam giac");
            return;
        } else {
            System.out.println("3 diem tao thanh mot tam giac");
            if (ab == bc && bc == ca){
                System.out.println("tam giac la tam giac deu");
            } else if (ab == bc || bc == ca || ca == ab) {
                System.out.println("tam giac la tam giac can");
            }

            float x = a.distanceSquare(b);
            float y = b.distanceSquare(c);
            float z = c.distanceSquare(a);

            if (x == y + z || y == x + z || z == x + y){
                System.out.println("tam giac la tam giac vuong");
            }
        }

        Point d = new Point();
        d.x = ConsoleUtil.inputFloat("d.x");
        d.y = ConsoleUtil.inputFloat("d.y");

        float s = a.triangleArea(b,c);
        float s1 = d.triangleArea(a,b);
        float s2 = d.triangleArea(b,c);
        float s3 = d.triangleArea(c,a);

        System.out.println("Dien tich s = " + s);
        System.out.println("Dien tich s1 = " + s1);
        System.out.println("Dien tich s2 = " + s2);
        System.out.println("Dien tich s3 = " + s3);

        if (s == s1 + s2 + s3){
            System.out.println("Diem d nam trong tam giac");
        } else {
            System.out.println("Diem d khong nam trong tam giac");
        }
    }
}
