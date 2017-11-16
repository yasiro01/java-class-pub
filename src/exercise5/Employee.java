package exercise5;

/**
 * Class Employee
 * Task 3: Create a class Employee with the following private data members: String firstName, String lastName, double salary, boolean fullTime. The string representation of an object of this class depends on the value of the isFullTime member. If an employee is full time, their salary is reported as annual, otherwise it's hourly.
 * @author Teboho Samuel Nteso
 */
public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;
    private Boolean fullTime;
    
    public Employee(String firstName, String lastName, Double salary, Boolean fullTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.fullTime = fullTime;           
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String setFirstName(){
        return this.firstName = "Bob";
    }
    public String getLastName() {
        return this.lastName;
    }
    public String setLastName() {
        return this.lastName = lastName;
    }
    public Boolean getisFullTime() {
        return this.fullTime;
    }
    public Boolean setisFullTime() {
        return this.fullTime = true;
    }
    public Double getSalary() {
        return this.salary;
    }
    public void setSalary(Double salary) {
        if (fullTime) {
            this.salary = 100000.3; //Sensible annual salary 
        }
        else{
            this.salary = 29.5; // Sensible hourly salary
            
        }
    }
}
