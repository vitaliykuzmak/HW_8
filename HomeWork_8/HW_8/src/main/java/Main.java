public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        Shape ellipse = new Ellipse();
        Shape pentagon = new Pentagon();
        Shape hexagon = new Hexagon();
        Shape rhombus = new Rhombus();
        Shape parallelogram = new Parallelogram();

        printer.printShapeName(circle);
        printer.printShapeName(rectangle);
        printer.printShapeName(triangle);
        printer.printShapeName(square);
        printer.printShapeName(ellipse);
        printer.printShapeName(pentagon);
        printer.printShapeName(hexagon);
        printer.printShapeName(rhombus);
        printer.printShapeName(parallelogram);
    }
}
