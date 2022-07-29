import java.util.Scanner;
class Fib
{
    public static void main(String[] args)
    {
      int n1=0,n2=1,n3,i,count;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the number");
      count=sc.nextInt();
      for(i=2;i<count;++i)
      {
        n3=n2+n1;
        System.out.println("fibonaci number:"+n3);
        n1=n2;
        n2=n3;
      }
    }
}