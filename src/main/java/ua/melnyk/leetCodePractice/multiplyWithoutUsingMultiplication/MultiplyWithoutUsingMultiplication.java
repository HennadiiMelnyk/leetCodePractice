package ua.melnyk.leetCodePractice.multiplyWithoutUsingMultiplication;

import static java.lang.Math.abs;

public class MultiplyWithoutUsingMultiplication {

    public static void main(String[] args) {
        System.out.println("1-" + multiply(2, 3));
        System.out.println("2-" + multiply2(2, 3));
        System.out.println("3-" + multiplierLoop(2, 3));
    }

    private static int multiply(int x, int y) {


        if (y == 0)
            return 0;


        if (y > 0)
            return (x + multiply(x, y - 1));

        /* the case where y is negative */
        if (y < 0)
            return -multiply(x, -y);

        return -1;
    }

    /**
     * @param multiplicand
     * @param factor
     * @return
     */
    private static int multiply2(int multiplicand, int factor) {
        if (factor == 0) return 0;

        int product = multiplicand;
        for (int ii = 1; ii < abs(factor); ++ii) {
            product += multiplicand;
        }

        return factor >= 0 ? product : -product;
    }

    /**
     * @param a
     * @param b
     * @return
     */
    public static int multiplierLoop(int a, int b) {
        int resultat = 0;
        for (int i = 0; i < a; i++) {
            resultat += b;
        }

        return resultat;
    }
}
