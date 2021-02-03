import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    welcome();
    System.out.println("What is your first number?");
    int num1 = scan.nextInt();
    System.out.println("What is your second number?");
    int num2 = scan.nextInt();

    System.out.println("added");
    System.out.println(sum(num1, num2));
    System.out.println("subtracted");
    System.out.println(sub(num1, num2));
    System.out.println("multiplied");
    System.out.println(mult(num1, num2));
    System.out.println("divided");
    System.out.println(div(num1, num2));
    System.out.println("first number squared");
    System.out.println(squ1(num1));
    System.out.println("second number squared");
    System.out.println(squ2(num2));

  }
  public static void welcome(){
    System.out.println("Welcome to the calculator! Type in what you want added then subtracted then multiplied then divided, then the square of the first number then the square of the second number");
  }

  static int sum(int num1, int num2)
  {
    return num1 + num2;
  }
  static int sub(int num1, int num2)
  {
    return num1 - num2;
  }
  
  static double mult(double num1, double num2)
  {
    return num1 * num2;
  }
  static double div(double num1, double num2)
  {
    return num1 / num2;
  }
  static int squ1(int num1)
  {
    return num1 * num1;
  }
  static int squ2(int num2)
  {
    return num2 * num2;
  }
}