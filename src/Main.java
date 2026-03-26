public class Main {
    static void main(String[] args) {
        ShapeFactory SF = new ShapeFactory();

        SF.createShape("square").draw();
        SF.createShape("square").draw();

        SF.createShape("circle").draw();
    }
}
