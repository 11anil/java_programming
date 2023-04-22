package conditional_statements;
import java.util.*;
public class else_if {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int age = sc.nextInt();   
        if(age > 18){
            System.out.println("vote,drive");
        }
        else if(age >=13 && age < 18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }
        sc.close();
    }
}
