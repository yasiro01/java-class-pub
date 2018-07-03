import java.util.Scanner;
import java.util.Random;

/**
 * @author yasiro01
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
    }
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8(numbers);
    task9();
    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
    System.out.println("Hello World");
    //throw new UnsupportedOperationException("Task 1 is not implemented yet.");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
    for (int i=1; i<101; i++) {
        if ((i%(3*5))==0) {
            System.out.println("huh");
        } else {
            if ((i%5)==0) {
                System.out.println("bar");
            } else {
                if ((i%3)==0) {
                    System.out.println("foo");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
    //throw new UnsupportedOperationException("Task 2 is not implemented yet.");
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
    int sum3 = 0;
    for (int i=1; i<101; i++) {
        if (i%7==0) {
            sum3 = sum3 + i;
        }
    }
    System.out.println("The sum of all multiples of 7 between 1 and 100 is " + sum3);

    //throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
    int sum4 = 0;
    long product4 = 1;
    for (int i=1; i<21; i++) {
        sum4 = sum4 + i;
        product4 = product4 * i;
//        System.out.println(product4);
    }
    System.out.println("The sum of all numbers between 1 and 20 is " + sum4);
    System.out.println("The product of all numbers between 1 and 20 is " + product4);

    //throw new UnsupportedOperationException("Task 4 is not implemented yet.");
  }
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    String fullname = "";
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your full name");
    try {
        fullname = keyboard.nextLine();
        String[] split = fullname.split(" ");
        String initials = "";
        for (int i=0; i<split.length; i++) {
            initials = initials + split[i].substring(0,1);
        }
    System.out.println("Your initials are " + initials);
    }
    catch (Exception e) {
        System.out.println("Oops! No input detected");
    }

    //throw new UnsupportedOperationException("Task 5 is not implemented yet.");
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    int[] array6 = new int[10];
    for (int idx=0; idx < array6.length; idx++) {
        array6[idx]=idx*idx*idx;
        System.out.print(array6[idx] + " ");
    }
    System.out.println();
    System.out.println();

    //throw new UnsupportedOperationException("Task 6 is not implemented yet.");
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
    Random rnd = new Random();
    rnd.setSeed(252);
    //KEEP ABOVE CODE
    int[] array7 = new int[100];
    for (int idx=0; idx<array7.length; idx++) {
        array7[idx]=rnd.nextInt(100);
    }

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number");
    try {
        int num = Integer.parseInt(keyboard.nextLine());
        boolean found = false;
        for (int idx=0; idx<array7.length; idx++) {
            if (array7[idx]==num) {
                found = true;
            }
        }
        if (found == true) {
            System.out.println(num + " was found in the array");
        } else {
            System.out.println(num + " was NOT found in the array");
        }
    }
    catch (Exception e) {
        System.out.println("Oops! No input detected");
    }
    System.out.println();

    //throw new UnsupportedOperationException("Task 7 is not implemented yet.");
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    int sum8 = 0;
    String display = "[";
    for (int idx=0; idx<numbers.length; idx++) {
        sum8 = sum8 + numbers[idx];
        display = display + numbers[idx] + " ";
    }
    display = display + "]";
    System.out.printf("Sum of all items in %s is " + sum8 + "\n", display);
    System.out.println();
    return sum8;

    //throw new UnsupportedOperationException("Task 8 is not implemented yet.");
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    boolean answer = true;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a word");
    String word = keyboard.nextLine();
    try {
        int charVal = word.charAt(0);
        for (char c :word.toCharArray()) {
            if ((int)c < charVal) {
                answer = false;
            } else {
                charVal = c;
            }
        }

        if (answer == true) {
            System.out.println("Letters of " + word + " are in order");
        } else {
            System.out.println("Letters of " + word + " are NOT in order");
        }
    }
    catch (Exception e) {
        System.out.println("Oops! No input detected");
    }
    System.out.println();
    return answer;

    //throw new UnsupportedOperationException("Task 9 is not implemented yet.");
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    System.out.println("---Task 10---");
    int n = 100;
    boolean[] array10 = new boolean[n];
    for (int i=0; i<array10.length; i++) {
        array10[i] = true;
    }
    for (int i=2; i<n; i++) {
        if (array10[i]==true) {
            for (int j=i*i; j<n; j=j+i) {
                array10[j]=false;
            }
        }
    }
    for (int idx=2; idx<n; idx++)
        if (array10[idx]==true) {
            System.out.print(idx + " ");
        }
    System.out.println();

    //throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }

}
