package Polymorphism;

public class Circle extends Shape {

    private int radius;

    public  int  getRadius(){

        return this.radius;
    }
    public void setRadius( int  radius){

        this.radius=radius;
    }
    @Override
    public double area(){
        double area =Math.PI*radius*radius;
        return area;
    }
}
