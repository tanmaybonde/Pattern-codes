import java.util.*;
class distance
{
    public int kilo;
    public int meter;
    public void scandata()
    {
        Scanner sc=new Scanner(System.in);
        kilo=sc.nextInt();
        meter=sc.nextInt();
    }
    public void convert()
    {
        System.out.println("Total meter will be --> "+((kilo*1000)+meter));
    }
}
class pro3
{
    public static void main(String xyz[])
    {
        distance d1,d2;
        d1=new distance();
        d2=new distance();
        d1.scandata();
        d2=d1;
        // System.out.println(d1.kilo);
        d1.convert();

    }
}