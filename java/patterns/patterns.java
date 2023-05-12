package patterns;

public class patterns {

    // Q1 // *
    // **
    // ***
    // *****

    // public static void main(String args[]){
    // for(int line = 1; line<=4; line++){
    // for(int star = 1; star<=line; star++){
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // Q2 // Inverted star pattern
    // ****
    // ***
    // **
    // *

    // public static void main(String args[]) {
    // int n = 4;
    // for (int line = 1; line <= 4; line++) {
    // for (int star = 1; star<=n-line+1; star++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // Q3 Half pyramid pattern
    // 1
    // 12
    // 123
    // 1234

    // public static void main(String args[]){
    // int n = 4;
    // for(int line = 1; line<=n; line++){
    // for(int number = 1; number<=line; number++){
    // System.out.print(number);
    // }
    // System.out.println();
    // }
    // }

    // Q4 Character pattern
    // A
    // BC
    // DEF
    // GHIJ

    public static void main(String args[]) {
        int n = 4;
        char ch = 'A';

        // i = line , j = character

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
