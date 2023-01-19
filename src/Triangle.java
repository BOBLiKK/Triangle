import java.util.Objects;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(){

        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void showInformation(){
        System.out.println("Sides of the triangle:");
        System.out.println("Side1: " + getSide1());
        System.out.println("Side2: " + getSide2());
        System.out.println("Side3: " + getSide3());
    }

    public void findPerimeter(){
        double perimeter;
        perimeter = getSide1() + getSide2() + getSide3();
        System.out.println("Perimeter: " + perimeter);
    }

    public double findHalfOfPerimeter(){
        double halfOfPerimeter;
        halfOfPerimeter = (getSide1() + getSide2() + getSide3()) / 2;
        return halfOfPerimeter;
    }

    public void findArea(){
        double area;
        double halfOfPerimeter;
        halfOfPerimeter = findHalfOfPerimeter();
        double temp1;
        temp1 = halfOfPerimeter * (halfOfPerimeter - getSide1()) * (halfOfPerimeter - getSide2()) * (halfOfPerimeter - getSide3());
        area = Math.sqrt(temp1);
        System.out.println("Area of the triangle: " + area);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Triangle triangle)){
            return false;
        }

        return Double.compare(triangle.getSide1(), getSide1()) == 0 && Double.compare(triangle.getSide2(), getSide2()) == 0 && Double.compare(triangle.getSide3(), getSide3()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide1(), getSide2(), getSide3());
    }
}
