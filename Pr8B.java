class A
{
    int x;
}
class B extends A
{
    int x;

    B(int a,int b)
    {
        super.x = a; 
        x = b; 
    }
    void display()
    {
        System.out.println("X of A :" + super.x);


        System.out.println("X of B :" + x);
    }
}
public class Pr8B
{
    public static void main(String[] args)
    {
        B obj = new B(2,4);
        obj.display();
    }
}