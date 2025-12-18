import java.util.Scanner;

// 2D class
class Plastic2D {
    double length, breadth;

    void get2DData(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate2DCost() {
        double area = length * breadth;
        return area * 40;
    }
}

// 3D class inheriting 2D
class Plastic3D extends Plastic2D {
    double height;

    void get3DData(double l, double b, double h) {
        get2DData(l, b);
        height = h;
    }

    double calculate3DCost() {
        double volume = length * breadth * height;
        return volume * 60;
    }
}
