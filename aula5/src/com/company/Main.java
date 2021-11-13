package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //exercicio 1;
        Point point = new Point(3,4);
        point.setX(5);
        point.setY(7);
       // System.out.println(point.getX() , point.getY());
        Point a1 = new Point(0,0);
        Point b2 = new Point(4,0);
        Point c = new Point(0,-4);

       double dist = a1.distanceTo(b2);
        //System.out.println(dist);
        //exercicio 3:
        //Triangle t = new Triangle(a1,b2,c);
      //  System.out.println(t.base());
      //  System.out.println(t.height());
       // System.out.println("Resultado " + t.area());
        //exercicio 4:
        Rectangle r = new Rectangle(0, 100, a1);
        System.out.println("Resultado "+r.area());
        System.out.println("Resultado perimeter: " + r.perimeter());
       boolean contains = r.containsPoint(new Point(150,50));
        System.out.println("Se é true? " + contains);





    }
}

