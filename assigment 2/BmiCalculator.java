// BMI Calculator
// You have been asked to write a Java program to implement a BMI (Body Mass
// Index) calculator. The program should have the following functionality:
// The BMI calculator class should have the following fields:
// a. height: A double field to store the height of the person in meters.
// b. weight: A double field to store the weight of the person in kilograms.
// The BMI calculator class should have the following methods:
// a. A constructor to initialize the height and weight fields of the BMI calculator
// object.
// b. Getter and setter methods.
// c. Double calculateBMI(): A method to calculate the BMI of the person using the
// following formula:
// BMI = weight / (height * height).
// Write a Java program that creates an object of the BMI calculator class, prompts the
// user to input their height and weight, sets the height and weight fields of the BMI
// calculator object using the setter methods, calculates the BMI using the
// calculateBMI() method, and prints the calculated BMI to the console
import java.util.Scanner;

class BmiCalculator {
  private double height;
  private double weight;

  BmiCalculator() {
    this.height = height;
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public double calculateBMI() {
    return (weight / (height * height));
  }
}

class BmiTester {
  BmiCalculator bmi = new BmiCalculator();
  static Scanner sc = new Scanner(System.in);

  public void acceptRecord() {
    //BmiCalculator bmi=new BmiCalculator(); //double instace is create
    System.out.println("==================BMI CALCULATOR===============");
    System.out.println("Enter Height in Meter");
    bmi.setHeight(sc.nextDouble());
    System.out.println("Enter Weight in kg");
    bmi.setWeight(sc.nextDouble());
  }

  public void printRecord() {
    System.out.println("======================RESULT===================");
    System.out.println("BMI result is " + bmi.calculateBMI());
  }

  public static int menuList() {
    System.out.println("0.Exit");
    System.out.println("1.Accept Record.");
    System.out.println("2.Print Record");
    System.out.print("Enter choice  : ");
    return sc.nextInt();
  }
}

class Calculator {

  public static void main(String[] args) {
    int choice;
    BmiTester result = new BmiTester();
    while ((choice = BmiTester.menuList()) != 0) {
      switch (choice) {
        case 1:
          result.acceptRecord();
          break;
        case 2:
          result.printRecord();
          break;
      }
    }
  }
}
