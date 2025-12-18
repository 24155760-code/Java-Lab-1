import java.util.Scanner;

class Fruit {
    void show() {
        System.out.println("This is a fruit");
    }
}
class Banana extends Fruit {
    void show() {
        System.out.println("This is a banana");
    }
}
class Cherry extends Fruit {
    void show() {
        System.out.println("This is a cherry");
    }
}

public class Main {
    public static void main(String[] args) {
        Fruit f;

        f = new Banana();
        f.show();

        f = new Cherry();
    }
}

/Main class
public class Fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of plastic 3D object");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("\nEnter length, breadth and height for 3D box:");
        double l3 = sc.nextDouble();
        double b3 = sc.nextDouble();
        double h3 = sc.nextDouble();

        sc.close();
    }
}
