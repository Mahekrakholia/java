interface P1
{
    int A = 1;
    void showA();
}
interface P2
{
    int B = 2;
    void showC();
}
interface P12 extends P1, P2
{
    int C = 3;
    void showC();
}
class Q implements P12
{
    public void showA()
    {
        System.out.println("A : " + A);
    }

    public void showB()
    {
        System.out.println("B : " + B);
    }
    public void showC()
    {
        System.out.println("C : " + C);
    }
}
public class NineB
{
    public static void main(String[] args)
    {
        Q obj = new Q();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}