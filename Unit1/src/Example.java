class A{
    public A()
    {
        System.out.println("Parent class");
    }
}
class B extends A{
    public B()
    {
        this(4);
        System.out.println("child class");
    }
    public B(int k){
        System.out.println("child class2");

    }
}
public class Example {
    public static void main(String []args)
    {
        B obj=new B();
    }
}
