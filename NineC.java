class A
{
    void show()
    {
        System.out.println("Inside Class-A");
    }
}
class B extends A
{
   
    void show()
    {
        System.out.println("Inside Class-B");
    }
}
public class NineC
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
    }
}