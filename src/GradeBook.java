// Start of GradeBook Program
// (C) 2014 kmaune0

import java.util.Scanner;

public class GradeBook {
  private String courseName;  // name of course this GradeBook represents
  private int total;  // sum of grades
  private int gradeCounter;  // number of grades entered
  private int aCount;  // count of A grades
  private int bCount;  // count of B grades
  private int cCount;  // count of C grades
  private int dCount;  // count of D grades
  private int fCount;  // count of F grades

  // constructor initializes courseName
  public GradeBook(String name) {
    courseName = name;  // initializes courseName
  }

  // method to set the course name
  public void setCourseName(String name) {
    courseName = name;  // store the course name
  }

  // method to retrieve the course name
  public String getCourseName() {
    return courseName;
  }

  // display a welcome message to the GradeBook user
  public void displayMessage() {
    System.out.printf("Welcome to the grade book for\n%s\n\n", getCourseName());
  }

  // input arbitrary number of grades from user
  public void inputGrades() {
    Scanner input = new Scanner(System.in);
    int grade;
    System.out.printf("%s\n%s\n  %s\n  %s\n",
    "Enter the integer grades in the range 0-100.",
    "Type the end-of-file indicator to terminate input:",
    "On UNIX/Linux/OS X type <Ctrl> d then press enter",
    "On Windows type <Ctrl> z then press enter");

    // loop until EOF is entered
    while (input.hasNext()) {
      grade = input.nextInt(); // read grade
      total += grade;  // add grade to total
      ++gradeCounter;  // increment number of grades

      // call method to increment appropriate counter
      incrementLetterGradeCounter(grade);
    }
  }

  // add 1 to appropriate counter for specified grade
  private void incrementLetterGradeCounter(int grade) {
    // determines which grade was entered
    switch (grade / 10) {
      case 9:  // grade was inbetween 90
      case 10:  // and 100, inclusive
        ++aCount;
        break;

      case 8:
        ++bCount;
        break;

      case 7:
        ++cCount;
        break;

      case 6:
        ++dCount;
        break;

      default:
        ++fCount;
        break;
    } // end switch
  }

  // display a report based on the grades entered by the user
  public void displayGradeReport() {
    System.out.println("\nGrade Report:");

    if (gradeCounter != 0) {
      // average of grades
      double average = (double) total / gradeCounter;

      // summary of results
      System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
      System.out.printf("Class aver is %.2f\n", average);
      System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
        "Number of student who received each grade:",
        "A:", aCount,
        "B:", bCount,
        "C:", cCount,
        "D:", dCount,
        "F:", fCount);
    }
    else
      System.out.println("No grades were entered.");
  }
}
