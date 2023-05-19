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
        

        
    
    public static void main(String args[]){
      bintodec(111);
    }
}
