package dz_7;

public class Student extends Person {
    private String idNumber;
    private double GPA;

    public Student(String name, int age, String gender, String idNumber, double GPA) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.GPA = GPA;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String toString() {
        return  super.toString() + ", idNumber: " + idNumber + ", GPA: " + GPA;
    }
}
