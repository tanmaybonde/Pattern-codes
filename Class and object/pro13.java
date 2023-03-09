// this keyword
class demo
{
    int x;
    void set(int x)
    {
        //x=a; // output will be 20 because x will taken the vale of a
        //x=x;   // it will return 0 because the local variabe and data memeber will have same symbol
               //  so thatwhy local varibale has highest priority than another variable x store 0
        this.x=x;  //this keyword will refer the referance of that object     
    }
    void print()
    {
        System.out.println("Data = "+ x);
    }
}
public class pro13
{
    public static void main(String[] args) {
       
        demo d;
        d=new demo();

        d.set(20);  //output will be 20 
        d.print();

    }
}