class Student {
    private int id;
    private String name;
    private int admissionYear;
    private double gpa;

    public Student(int id, String name, int admissionYear, double gpa) {
        this.id = id;
        this.name = name;
        this.admissionYear = admissionYear;
        this.gpa = gpa;
    }

    public void showDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("GPA: " + gpa);
    }

    public void updateGPA(double newGPA) {
        gpa = newGPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "John Doe", 2021, 3.5);

        System.out.println("Details:");
        student.showDetails();

        student.updateGPA(3.8);
        student.setName("Deez nut");
        student.setId(69);
        student.setAdmissionYear(2023);

        System.out.println("Updated Details:");
        student.showDetails();
    }
}

