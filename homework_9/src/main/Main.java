package main;

import base.BaseShape;
import circleshapes.Circle;
import triangleshapes.EquilateralTriangle;
import triangleshapes.RightTriangle;
import volumetricshapes.Cylinder;
import volumetricshapes.Sphere;
import volumetricshapes.VolumetricShape;

public class Main {
    public static void main(String[] args) {

        BaseShape circle = new Circle(5.0);
        VolumetricShape cylinder = new Cylinder(1, 2);
        VolumetricShape sphere = new Sphere(5);
        BaseShape equilateralTriangle = new EquilateralTriangle(10);
        BaseShape rightTriangle = new RightTriangle(5, 5, 6);
        printAreaAndPerimeter(circle);
        printAreaAndPerimeter(cylinder);
        printAreaAndPerimeter(sphere);
        printAreaAndPerimeter(equilateralTriangle);
        printAreaAndPerimeter(rightTriangle);
        shapeVolume(cylinder);
        shapeVolume(sphere);


    }

    public static void printAreaAndPerimeter(BaseShape s) {
        printInfo(s);
        System.out.println("Area: " + s.area());
        System.out.println("Perimeter: " + s.perimeter());

    }

    public static void shapeVolume(VolumetricShape volumetricShape) {

        printInfo(volumetricShape);
        System.out.println("Volume : " + volumetricShape.volume());
    }

    public static void printInfo(BaseShape s) {
        s.printInfo();
    }

}