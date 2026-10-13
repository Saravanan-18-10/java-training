import java.util.Scanner;
public class driving{
public static void main (String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter your age:");
   int a=sc.nextInt();
   String result=((a>=18) ? "Eligible" : "Not Eligible");
   System.out.println(result);

  }
}