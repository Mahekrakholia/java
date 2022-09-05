class FinalClass
{
    protected int a=200;
    protected int b=100;
}
final class FinalClassDemo extends FinalClass
{
    FinalClassDemo()
    {
        System.out.println("The Final Class");
        System.out.println("The Final Class not Inherited");
        System.out.println("Final class of inherited classes");
    }
    void add()
    {
        int c=a+b;
        System.out.println("Addition : "+c);
    }
}
class Pr10B
{
    public static void main(String arg[])
    {
        FinalClassDemo f=new FinalClassDemo();
        f.add();
    }
}