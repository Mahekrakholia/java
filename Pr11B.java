import java.util.Scanner;

class DivByZero{
    public void divByZero(int a,int b) {

        try {
            System.out.println("Result: " + "" + a / b);
        }
        catch(ArithmeticException e) {
            System.err.println("Can't divide by zero");
         }
        }
        public void arrOut(int arrNo){
            try{
                int arr[]=new int[5];
                for(int i=0; i<=arrNo;i++) {
                    for (int j = 0; j <= i; j++) {
                        arr[i] = j;
                    }
                }
                for(int i=0; i<=arrNo;i++){
                    System.out.println(arr[i]);
            }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Stay in your limit..!!");
            }


        }

    }

public class Pr11B {
    public static void main(String[] args) {
        System.out.println("Enter number to divide: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        DivByZero e1 = new DivByZero();
        e1.divByZero(a,b);
        System.out.println("Enter number to Generate Array : ");
        Scanner sc1 = new Scanner(System.in);
        int arrNo = sc.nextInt();
        e1.arrOut(arrNo);

    }
}