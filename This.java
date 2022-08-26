class Test
{
int a;
public void main(int a)
{
this.a=a;
System.out.println(a);
}
}
class This
{
public static void main(String[] args)
{
Test t1 = new Test();
t1.main(5);
}
}