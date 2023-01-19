public class Main {
    public static void main(String[] args) {

        Triangle firstTriangle = new Triangle(12, 17, 19);
        firstTriangle.showInformation();
        firstTriangle.findPerimeter();
        firstTriangle.findArea();

        Triangle secondTriangle = new Triangle();
        secondTriangle.showInformation();
        secondTriangle.setSide1(9);
        secondTriangle.setSide2(7);
        secondTriangle.setSide3(3);
        secondTriangle.showInformation();
        secondTriangle.findPerimeter();
        secondTriangle.findArea();
    }
}