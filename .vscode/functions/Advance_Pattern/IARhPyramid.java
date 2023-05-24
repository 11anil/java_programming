package Advance_Pattern;

public class IARhPyramid {
    public static void inverted_rotated_half_pyramid(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_num(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            // outer loop
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n ){
       int counter = 1;
       //outer loop
        for(int i=1; i<=n; i++){

            //how many times counter will be printed 
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++){
          for(int j=1; j<=i; j++){
            if((i+j)%2 == 0){
              System.out.print("1");
            }else{
              System.out.print("0");
            }
          }
          System.out.println();
        }
      }
    
    public static void main(String args[]){
        // inverted_rotated_half_pyramid(4);
        // inverted_half_pyramid_with_num(5);
        // floyd_triangle(5 );
        zero_one_triangle(5);
    }
}
