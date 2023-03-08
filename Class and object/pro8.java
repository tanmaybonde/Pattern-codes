//this is ilogical but still run for practice
import java.util.*;
class Distance
{
    int km,mtr;

    public void scandata(Distance T)   
    {
        Scanner sc=new Scanner(System.in);
        km=sc.nextInt();
        mtr=sc.nextInt();
        T.km=sc.nextInt();
        T.mtr=sc.nextInt();
    }
    public void convert(Distance T)
    {
        int total;
        total=km*1000+mtr;
        System.out.println("Total =="+total);
        total=T.km*1000+T.mtr;
        System.out.println("Total =="+total);
    }
    public void print()
    {
        System.out.println("km ="+km+"Meter = "+mtr);
    }
}

public class pro8 {
    public static void main(String[] args) {
        Distance d1,d2;
        d1=new Distance();
        d2=new Distance();

        d1.scandata(d2);
        d1.convert(d2);
    }
}