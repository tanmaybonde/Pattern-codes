public class pattern5 {
    public static void main(String xyz[]){
        int j=0;
        for(int i=1;i<=5;i++){
            for(j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }

            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    
}

/*
     *
    ***
   *****
  *******
 *********
 
 */
