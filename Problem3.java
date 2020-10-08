import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


public class Problem3 {

  public static void main(String[] args) {
    int me = 0;
    int you = 0;

  while(Math.abs(me - you) < 2) {
    Scanner scanner = new Scanner(System.in);
   int num1;
   System.out.println("scissor (0), rock (1), paper(2), Please enter number");

  num1 = scanner.nextInt();

    Random rand = new Random();
    int num2 = rand.nextInt(3);



  switch(num1){
    case 0 :
     if (num1 == num2)
     System.out.println("The computer is scissor. You are scissor too. It is a draw");
else if (num2 == 1) {
System.out.println("The computer is rock. You are scissor. You lost");
// System.out.println(me - you);
// System.out.println(me);
// System.out.println(you);
you +=1; }
else if (num2 == 2) {
System.out.println("The computer is paper. You are scissor. You won");
me +=1; 
// System.out.println(me - you);
// System.out.println(me);
// System.out.println(you);
}
  break;
    case 1 :
    if (num1 == num2)
     System.out.println("The computer is rock. You are rock too. It is a draw");
else if (num2 == 0) {
System.out.println("The computer is scissor. You are rock. You won");
me +=1;
// System.out.println(me - you); 
// System.out.println(me);
// System.out.println(you);
}
else if (num2 == 2) {
System.out.println("The computer is paper. You are rock. You lost");
you +=1; 
// System.out.println(me - you);
// System.out.println(me);
// System.out.println(you);
}
  break;
    case 2 :
    if (num1 == num2)
     System.out.println("The computer is paper. You are paper too. It is a draw");
else if (num2 == 0) {
System.out.println("The computer is scissor. You are paper. You lost");
you +=1; 
// System.out.println(me - you);
// System.out.println(me);
// System.out.println(you);
}
else if (num2 == 1) {
System.out.println("The computer is rock. You are paper. You won");
me +=1; 
// System.out.println(me - you);
// System.out.println(me);
// System.out.println(you);
}
  break;
  default :
  System.out.println("not valid");
break;
  }
}
if (me > you)
System.out.println("Good game. You won.");
else 
System.out.println("Good game. You lost.");
  }
}