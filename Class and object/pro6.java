import java.util.*;
class myclass
{
    int km,mtr;

    public void scandata()   
    {
        Scanner sc=new Scanner(System.in);
        km=sc.nextInt();
        mtr=sc.nextInt();
    }
    public void convert()
    {
        int total;
        total=km*1000+mtr;
        System.out.println("Total =="+total);
    }
    public void print()
    {
        System.out.println("km ="+km+"Meter = "+mtr);
    }
}
public class pro6
{
    public static void main(String xyz[])
    {
        myclass t1;
        t1=new myclass();
        t1.scandata();
        t1.convert();
        t1.print();


    }
}