package conditional_statements;
public class ternary_operators {
    public static void main(String args[]) {
        int number = 3;
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
