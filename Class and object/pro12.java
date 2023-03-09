// Static Block

import java.util.*;
class Demo
{
    static
    {
        System.out.println("I am in demo class");
    }
}
public class pro12
{
    static
    {
        System.out.println("I am in static fun()");
    }
    public static void main(String[] args)
    {
        Demo d1=new Demo();
        System.out.println("I am in main fun()");
    }
}