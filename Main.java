class Main {
  public static void main(String[] args) {
    int sum = sum(2,3);
    System.out.println(sum);
    double mult = mult(5,1.1);
    System.out.println(mult);
  }

  static int sum(int num1, int num2)
  {
    return num1 + num2;
  }
  static double mult(double num1, double num2)
  {
    return num1 * num2;
  }
}