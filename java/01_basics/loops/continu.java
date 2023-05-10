// import java.util.*;

// public class continu {

// continue statement

// public static void main(String args[]){
// for(int i =1; i<=5; i++){
// if(i==3){
// continue;
// }
// System.out.println(i);
// }
// }
// }

// Q- continue statement

import java.util.Scanner;

class Continu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            } 
            System.out.println("Number entered: " + n);
            // sc.close(); 
        } while (true);
         
    }
}

