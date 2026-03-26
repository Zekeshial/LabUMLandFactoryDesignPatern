

public class ShapeFactory {
    public Shapable createShape(String shapeType) {
        switch (shapeType) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
