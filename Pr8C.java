interface AOne
{
    public abstract void name();
}
interface BOne
{
    public abstract void add();
}
class C implements AOne,BOne
{
    public void name()
    {
        System.out.println("mahek rakholia");
    }
    public void add()
    {
        System.out.println("i belong to surat");
    }
}
public class Pr8C
{
    public static void main(String[] args)
    {
        C obj = new C();
        obj.name();
        obj.add();
    }
}