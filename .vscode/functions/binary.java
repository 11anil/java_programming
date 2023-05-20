public class binary {
    public static void bintodec(int binarynum){
        int mynum = binarynum;
        int pow = 0;
        int decnum = 0;

        while(binarynum > 0){
            int lastdigit = binarynum % 10;
            decnum = decnum + (lastdigit *(int) Math.pow(2, pow));

            pow++;
            binarynum = binarynum / 10;
        }
    System.out.println("Decimal of " +mynum +" = " + decnum);
    }
        
public static void dectobin(int n){
    int mynum = n;
    int binnum = 0;
    int pow = 0;

    while(n>0){
        int rem = n % 2;
        binnum = binnum + (rem * (int ) Math.pow(10, pow));

        pow++;
        n = n/2;
    }
    System.out.println("binary form of  " + mynum + " = " + binnum);
}
        
    
    public static void main(String args[]){
    //   bintodec(111);
    dectobin(7);
    }
}
