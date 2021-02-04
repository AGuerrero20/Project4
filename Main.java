import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    welcome();
    int num1 = scan.nextInt();

    System.out.println("first number squared");
    System.out.println(squ1(num1));

  }
  public static void welcome(){
    System.out.println("Welcome to the calculator! Type in the number you want squared");
  }
  static int squ1(int num1)
  {
    return num1 * num1;
  }
  
}