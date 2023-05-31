import java.util.*;

public class oddoreven {
    public static void OddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String args[]) {
        // OddorEven(11);
        // OddorEven(13);
        // OddorEven(14);

        System.out.println(getIthBit(10, 3));

    }
}
