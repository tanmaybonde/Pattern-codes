// passing object as parameter
class Number
{
    int x,y;
    static Number getnumber()
    {
        Number ref;
        ref=new Number();
        ref.x=10;
        ref.y=20;

        return ref;
    }
}
public class pro4
{
    public static void main(String xyz[])
    {
        Number t1;
        t1=Number.getnumber();
        System.out.println(t1.x +"  "+t1.y);
    }
}