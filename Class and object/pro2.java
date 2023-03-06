import java.util.*;
class Number
{
    int x;
    int y;
    public void scandata()  //non static member functions
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("first -->");
        x=sc.nextInt();
        System.out.print("Second -->");
        y=sc.nextInt();
    }
    public void print()
    {
        System.out.println("x--> 2" +x+" y-->"+y);
    }
    public void add()
    {
        System.out.println("Additon--> "+(x+y));
    }
}
public class pro2
{
    public static void main(String xyz[])
    {
        Number obj;
        obj=new Number();
        obj.scandata();
        obj.print();
        obj.add();
    }

}