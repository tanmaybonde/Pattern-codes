import java.util.*;
class Time
{
    public int hrs,min;

    void scan()
    {
        Scanner sc=new Scanner(System.in);
        hrs=sc.nextInt();
        min=sc.nextInt();

        convert();
    }

    // void convert()
    // {
    //     int total;
    //     total=hrs *60 +min;
    //     System.out.println("Total = "+ total);
    // }

    private void convert()
    {
        int total;
        total=hrs *60 +min;
        System.out.println("Total = "+ total);
    }


}
public class pro11
{
    public static void main(String[] args) {
        Time t1,t2;
        t1=new Time();
        t2=new Time();

        t1.scan();

        //t1.convert();
        //t2.convert();
    }
}