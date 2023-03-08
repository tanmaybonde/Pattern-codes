class pro
{
    int x;
    public static int y;
    static void show()
    {
        //x=10;// not accesible 
        pro ref=new pro();
        ref.x=50;
        y=50;
        System.out.println("ref.x ="+ref.x+" y = "+y);
    }
}

public class pro10 {
    public static void main(String[] args) {
        pro t1;
        t1=new pro();
        pro.show();
    }
}