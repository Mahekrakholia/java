class Parent
{
Parent()
{
System.out.println("this is parent class");
}
}
class Child extends Parent
{
Child()
{
super();
System.out.println("this is child class");
}
}
class Super
{
public static void main(String[] args)
{
Child c1 = new Child();
}
}