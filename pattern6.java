import java.util.*;
public class pattern6 {
    public static void main(String xyz[]){
        int n=0;
        System.out.println("Enter the No of rows you want -->");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int j=0,i=0,k=0;
        for(i=1;i<=n;i++){
         for(j=1;j<=i;j++){
            System.out.print(" ");
         }
         for(k=i;k<n;k++){
            System.out.print("*");
         }

         for(j=i;j<=n;j++){
            System.out.print("*");
         }
            System.out.println();
        }
    }
}

/* 

 *********
  *******
   *****
    ***
     *


*/
