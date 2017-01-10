package factoryPattern;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        } else {
            return null;
        }
    }

}