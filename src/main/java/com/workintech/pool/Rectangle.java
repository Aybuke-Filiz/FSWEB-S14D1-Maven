package com.workintech.pool;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle( double width,double length) {
        this.length =  Math.max(length,0);
        this.width = Math.max(width,0);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return this.length*this.width;
    }
}
