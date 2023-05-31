import java.util.*;

public class oddoreven {
    public static void OddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
    
          
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
       public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
       }
       public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
       }
       public static int updateIthBit(int n , int i , int newbit){
    //     if(newbit == 0){
    //         return clearIthBit(n, i);
    //     }else{
    //         return setIthBit(n, i);

           n = clearIthBit(n,i);
           int bitMask = newbit<<i;
           return n | bitMask;
        }
     
    public static int clearIbits(int n , int i){
        int bitMask = ~(0) <<i ;
        return n & bitMask;
    }
       
    public static void main(String args[]) {
        // OddorEven(11);
        // OddorEven(13);
        // OddorEven(14);

        // System.out.println(getIthBit(10, 3));
        // System.out.println(setIthBit(10,2));
        // System.out.println(clearIthBit(10,1));
        // System.out.println(updateIthBit(10,2,1));
        System.out.println(clearIbits(15,2));
    }
}
