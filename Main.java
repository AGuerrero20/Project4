import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    welcome();
    int num1 = scan.nextInt();

    System.out.println("area of the cube in feet");
    System.out.println(area(num1));

  }
  public static void welcome(){
    System.out.println("Welcome to the calculator! Type in the length of one edge of the cube in feet to get the area");
  }
  static int area(int num1)
  {
    return num1 * num1 * 6;
  }
  
}