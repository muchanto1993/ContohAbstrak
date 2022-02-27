package main;

public class Circle extends Shape {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    float getArea() {
        // TODO Auto-generated method stub
        return (float) (Math.PI * radius * radius);
    }

}
