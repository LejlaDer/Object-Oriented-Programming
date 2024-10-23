package people;
import java.util.ArrayList;

public class Student extends Person {

    private int credits;
    private int studentId;
    private ArrayList<Integer> grades;

    public Student(String name, String address, String country, int age, int studentId) {
        super(name, address,country, age);
        this.credits = 0;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public int credits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void addGrade(int grade) {
        if (grade >=6 && grade <=10)
            this.grades.add(grade);
        else
            System.out.println("Invalid grade");
    }

    public void getGrade() {
        for (Integer i : this.grades) {
            System.out.print(i + " ");
        }
    }

    public void study()
    {
        this.credits++;
    }

}
