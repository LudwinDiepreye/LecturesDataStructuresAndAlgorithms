package Task4;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(12);
        Shape rectangle = new Rectangle(14, 26);
        Shape square = new Square(43);

        System.out.println("Площа кола: " + circle.area());
        System.out.println("Площа прямокутника: " + rectangle.area());
        System.out.println("Площа квадрата: " + square.area());
    }
}
