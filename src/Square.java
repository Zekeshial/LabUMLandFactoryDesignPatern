public class Square implements Shapable{

    private int width, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }

    @Override
    public String returnNameType() {
        return "Square";
    }
}
