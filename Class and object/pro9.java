class pro
{
    int x;
    static int y;
    void show()
    {
        System.out.println("x = "+x+" y = "+y);
    }
    void change()
    {
        x++;
        //pro.y++;
        y++;  //beacause the static dta memeber is use inside it's own member function
    }

}
public class pro9 {
    public static void main(String[] args) {
        pro t1,t2,t3;
        t1=new pro();
        t2=new pro();
        t3=new pro();
        

        t1.change();
        t1.show();

        t2.change();
        t2.show();

        t3.change();
        t3.show();
    }
}