package com.company;

import java.awt.*;

public abstract class Shape {
    private Point position;


    public Shape(Point position ){
        this.position = position;
    }
    public Point getPosition() {
        return position;
    }
    public void setPosition(Point position) {
        this.position=position;
    }
    public abstract double getArea();
    public abstract double getPerimeter();





}
