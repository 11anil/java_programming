public class callbyvalue {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;


        System.out.println("A is = " + a);
        System.out.println("B is = " + b);
    }
    public static void main(String args[]){
        int a = 10;
        int b = 5;


        swap(a, b);
    }
}
