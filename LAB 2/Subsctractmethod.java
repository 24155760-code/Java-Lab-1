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
