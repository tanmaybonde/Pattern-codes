class Student
{
    public int age;
    public int roll;
}
public class pro1
{
    public static void main(String xyz[])
    {
        Student s,s1;
        s=new Student(); ///creation of object
        s1=new Student(); 
        System.out.println("S =="+s.hashCode());
        System.out.println("S1 =="+s1.hashCode());
    }
}