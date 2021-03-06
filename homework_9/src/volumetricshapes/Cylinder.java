package volumetricshapes;

import circleshapes.Circle;

public class Cylinder extends Circle implements VolumetricShape {

    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double volume() {

        return Math.PI * Math.pow(getRadius(), 2) * height;

    }

    @Override
   public double perimeter() {

        return (super.perimeter() + height) * 2;
    }

    @Override
  public   double area() {

        return 2 * (Math.PI * getRadius() * (height + getRadius()));

    }

    @Override
    public void printInfo() {
        System.out.println("It's a cylinder with radius " + getRadius() + " and height " + height);
    }


}
