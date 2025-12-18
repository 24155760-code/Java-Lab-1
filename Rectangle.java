import java.util.Scanner;

public class Rectangle {
    private double length;
    private double breadth;
    private double area;
    private double perimeter;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();
    }

    public void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    public void display() {
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.read();
        rect.calculate();
        rect.display();
    }
}