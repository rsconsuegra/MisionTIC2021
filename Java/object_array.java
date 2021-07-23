class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

// Elements of the array are objects of a class Student.
public class object_array {
    public static void main(String[] args) {
        // declares an Array of integers.
        Student[] students;

        // allocating memory for 5 objects of type Student.
        students = new Student[5];

        // initialize the first elements of the array
        students[0] = new Student(1, "aman");

        // initialize the second elements of the array
        students[1] = new Student(2, "vaibhav");

        // so on...
        students[2] = new Student(3, "shikar");
        students[3] = new Student(4, "dharmesh");
        students[4] = new Student(5, "mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < students.length; i++)
            System.out.println("Element at " + i + " : " + students[i].roll_no + " " + students[i].name);
    }
}