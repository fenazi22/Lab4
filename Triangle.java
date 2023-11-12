public class Triangle extends Shape {
    private double height, base;


    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Triangle: "+( (1d/2d)* (base*height)));
    }

    @Override
    void calculateCircumference() {
        double hypo = Math.sqrt(base*base + height*height);
        double per = base + height + hypo;
        System.out.println("Circumferenc of triangle: " + per);
    }
}
