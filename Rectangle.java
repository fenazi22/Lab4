public class Rectangle extends Shape{
    private double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    void calculateArea() {
        System.out.println("area of rectangle: "+(height*width));
    }

    @Override
    void calculateCircumference() {
        System.out.println("Circumference of rectangle: "+2*(height*width));

    }

}
