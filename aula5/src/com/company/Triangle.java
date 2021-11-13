package com.company;

public class Triangle {

    private Point a;
    private  Point b;
    private  Point c;


    public Triangle(Point a, Point b,Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double base() {
       return a.distanceTo(b);
    }
    public double height() {
        return b.distanceTo(c);
    }
    public double area() {
         return (height() * base()) / 2;
    }


    public Point getA() {
        return a;
    }
    public Point getB() {
        return b;
    }
    public Point getC() {
        return c;
    }
    public void setA(Point a) {
        this.a=a;
    }
    public void setB(Point b) {
        this.b=b;
    }
    public void setC(Point c) {
        this.c = c;
    }
    public void setABC(Point a,Point b,Point c) {
        this.a=a;
        this.b=b;
        this.c=c;

    }

}
