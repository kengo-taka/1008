import java.util.Scanner;


/**
 * Problem2
 */
public class Problem2 {

  public static void main(String[] args) {
    Scanner hello = new Scanner(System.in);

  System.out.println("Please enter number");
  int number = hello.nextInt();

  for (int i = 1; i <= number ; i++) {
    String numberNumber ="";
for ( int j = 1; j <= number ; j++) {
int table = i * j;
numberNumber = numberNumber + table + " ";
}
System.out.println(numberNumber);
  }
  }
}