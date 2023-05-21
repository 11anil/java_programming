public class scope {
    public static void demo(){
        // int s = 45;  // here it will throe an error because its not has its scope.
    }

    // method scope
//     public static void main(String args[]){
//     int s = 45;
//     System.out.println(s);
// }

// block scope
public static void main(String args[]){
    int p = 45;

    {
        int s = 45;   // s only print in his own block it cannot be print outside of this block
        System.out.println(s);
    }
      System.out.println(p);

}

}
