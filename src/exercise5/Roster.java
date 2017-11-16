package exercise5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Roster
 * Task 10: Create a class Roster that contains a private member ArrayList<Student> studentList (reuse class Student from task 9). Its constructor must take the name of a file as a parameter, read data from the file (sample roster.csv is provided, another file of a similar structure may be used for grading), create an object of type Student based on the content of a line, and add that object to the ArrayList studentList.
 * Implement method printRoster that prints all the elements of the studentList.
 * @author Teboho Samuel Nteso
 */
public class Roster {
    private ArrayList<Student> studentList;
    String name;
    String major;
    Double gpa;
    
    public Roster(String Filename, String name, String major, Double gpa){
        Scanner reader = new Scanner(System.in);
        studentList = new ArrayList<Student>();
    try{
         reader = new Scanner(new File(Filename));
    }catch (FileNotFoundException e) {
           System.out.println("The file you have selected can not be opened"+FileName);
           System.exit(0);
    }
       while (reader.hasNextLine()){
           String[] fields = reader.nextLine.split(",");
           this.gpa= fields[2];
           this.name = fields[0];
           this.major = fields[1];
           Student studentList = new Student(name,major,gpa); 
           studentList.put(position, song);
       }
       reader.close();
    }

    @Override
    public String toString() {
        return "Roster{" + "studentList=" + studentList + '}';
    }
    
  
}

