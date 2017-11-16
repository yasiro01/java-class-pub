package exercise5;

/**
 * Class Student
 * Task 9: Create a class Student with the following private data members: String name, String major, double gpa.
 * Implement setters for major and gpa
 * @author Teboho Samuel Nteso
 */
public class Student {
    String name;
    String major;
    Double gpa;
    
    public Student (String name, String major, Double gpa) {
        this.name = name;
        this.gpa = gpa;
        this.major = major;
    }
    
    public Double setgpa(){
        return this.gpa = 3.4;
    }
    public String setmajor () {
        return this.major = "Computer Science";
    }
}

