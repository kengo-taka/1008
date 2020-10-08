import java.util.Scanner;

/**
 * Problem1
 */
public class Problem1 {

  public static void main(String[] args) {
    Scanner hello = new Scanner(System.in);

  System.out.println("Please enter miles");
  double miles = hello.nextDouble();

  double km =  miles * 1.609;
  System.out.println(km + "km");
  }
}