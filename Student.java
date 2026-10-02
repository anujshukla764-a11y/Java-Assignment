class Student {

    // Private data members
    private String name;
    private int age;
    private double marks;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for marks
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    public static void main(String[] args) {

        // Creating an object
        Student student = new Student();

        // Setting values using setters
        student.setName("Anuj Shukla");
        student.setAge(19);
        student.setMarks(89.5);

        // Displaying values using getters
        System.out.println("Student Details");
        System.out.println("----------------------");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Marks: " + student.getMarks());
    }
}
