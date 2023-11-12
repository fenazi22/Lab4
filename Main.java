public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n" +
                "\t\t\t     \\|/\n" +
                "\t\t\t     / \\      <- Faisal Abdullah Alanazi\n" +
                "\t\t\t _ _/ O \\_ _     Lab 4 \n\n");



Triangle tri=new Triangle(3,4);
tri.calculateArea();
tri.calculateCircumference();

Circle cir=new Circle(10);
cir.calculateArea();
cir.calculateCircumference();
Rectangle Re=new Rectangle(10,20);
Re.calculateArea();
Re.calculateCircumference();
    }
}