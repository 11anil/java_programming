package conditional_statements;

public class largest_of_3{
    public static void main(String args[]){
        int a = 1, b = 3, c = 2;
        if(a >=b && a>=c){
            System.out.println("Largest num is a");
        }
        else if(b>=c){
            System.out.println("largest num is b");
        }
        else{
            System.out.println("largest num is c");
        }
    }
}