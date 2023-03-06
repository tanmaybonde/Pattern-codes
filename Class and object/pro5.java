// passing object as parameter
import java.util.*;
class Number
{
    public int x,y;
    public void scan()
    {
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
    }
    public void add(Number s1,Number s2)
    {
        int x,y;
        x=s1.x+s2.x;
        y=s1.y+s2.y;
        System.out.println(x+"   "+y);
    }

}
public class pro5
{
    public static void main(String xyz[])
    {
        Number t1,t2,t3;
        t1=new Number();
        t2=new Number();
        t3=new Number();
        t1.scan();
        t2.scan();
        t3.add(t1,t2);
    
    }
}