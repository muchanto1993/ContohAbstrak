package main;

public abstract class Shape {

    String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract float getArea();

}