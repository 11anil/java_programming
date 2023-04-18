package operators;

public class logical {
    public static void main(String args[]){

        // Logical operators 

        // logical end     ---- only give the output true if both the conditions are true

       int a = 10;
       int b = 5;

    //    System.out.println(a>b && b<a);
    //    System.out.println(a<b && b<a);
    //    System.out.println(a>b && b>a);
    //    System.out.println(a<b && b>a);

    //logical OR  ---- only give the output false if both the conditions are false

    // System.out.println(a>b || b<a);
    // System.out.println(a>b || b>a);
    // System.out.println(a<b || b<a);
    // System.out.println(a<b || b>a);

    //logical Not  --change the true value in false and false value in true

    System.out.println(!(a<b));
    System.out.println(!(a>b));
    }
}
