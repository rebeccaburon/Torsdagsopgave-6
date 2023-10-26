public class Main {
    public static void main(String[] args) {
        ShapeBuilder builder = new ShapeBuilder();


        builder.addShape(new Square(8.0));
        builder.addShape(new Circle(7.0));

        double totalArea = builder.getTotalArea();
        System.out.println("Arealet for firguren er: " + totalArea );
    }
}