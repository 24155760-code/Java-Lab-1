import java.util.Scanner;
class Student{
    int roll;
    String name;
    double cgpa;
    Student(int r, String n, double c) {
        roll = r;
        name = n;
        cgpa = c;
    }
    void display() {
        System.out.println(roll + "\t" + name + "\t" + cgpa);
    }
}
class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Roll: ");
            int roll = sc.nextInt();
            sc.nextLine(); // clear buffer
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            s[i] = new Student(roll, name, cgpa);
        }
        System.out.println("\nRoll\tName\tCGPA");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }
        int min = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[min].cgpa) {
                min = i;
            }
        }

        System.out.println("\nStudent with Lowest CGPA:");
        System.out.println("Name: " + s[min].name);
        System.out.println("CGPA: " + s[min].cgpa);
    }
}