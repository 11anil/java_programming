// que 1 - input from user to print positive or negive number.

// package conditional_statements;
// import java.util.*;
// public class practice_set_conditional_statement{
//     public static void main(String args[]){
//      Scanner sc = new Scanner(System.in);
//      int number = sc.nextInt();
//      if(number>=0){
//         System.out.println("positive");
//      }
//      else{
//         System.out.println("negitive");
//      }
//      sc.close();
//     }
// }

// Que 2 - following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever

// package conditional_statements;
//     public class practice_set_conditional_statement{
//         public static void main(String args[]){
//          double temp = 103.5;
//          if(temp >= 100){
//             System.out.println("you have a fever");
//          }
//          else{
//             System.out.println("you do not have a fever");
//          }

//         }
//     }

package conditional_statements;
import java.util.*;
public class practice_set_conditional_statement{
    public static void main(String args[]){
    System.out.println("Enter week number(1-7): ");
    Scanner sc = new Scanner(System.in);
    int week = sc.nextInt();
    switch(week) {
        case 1 : 
        System.out.println("monday");
        break;
        case 2 : 
        System.out.println("tuesday");
        break;
        case 3 : 
        System.out.println("wednesday");
        break;
        case 4 : 
        System.out.println("thursday");
        break;
        case 5 : 
        System.out.println("friday");
        break;
        case 6 : 
        System.out.println("saturday");
        break;
        case 7 : 
        System.out.println("sunday");
        break;
       }
       sc.close();
    }
}