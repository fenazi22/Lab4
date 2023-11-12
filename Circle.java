public class Circle extends Shape {
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Circle:"+Math.PI*(radius*radius));
    }

    @Override
    void calculateCircumference() {
        System.out.println("Circumference of Circle:"+2*Math.PI*(radius*radius));

    }
}
