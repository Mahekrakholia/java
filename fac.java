import java.util.Scanner;
class Fac
{
   public static void main(String[] args)
   {
      int i,number,fact=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      number=sc.nextInt();
      
      for(i=1;i<number;i++)
      {
         fact=fact*i;
      }
      System.out.println("Factorial number is"+fact);
   }
}
      
  