package BaiBip;

import java.text.DecimalFormat;

public class Circle implements GemetricObject{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }
    @Override
    public String toString(){
        return "Circle[radius=" + this.radius +"] | " + "Perimeter = " + this.getPerimeter() + " | Area = " + this.getArea();
    }
}
