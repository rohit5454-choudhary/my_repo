
public class Student {
    String name;
    int age;
    int marks;

    // Method to display all student info
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "ankit";
        s1.age = 23;
        s1.marks = 100;

        // Ek saath sab variable print karo
        s1.display();
    }
}


