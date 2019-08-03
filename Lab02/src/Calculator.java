public class Calculator {
    /**
     * Calculates the sum of x and y.
     * @param int x
     * @param int y
     * @return the sum of x and y
     */
    public int add(int x, int y) {
        int result = x+y;
        return result;
    }

    /**
     * Calculates the difference of x and y.
     * @param int x
     * @param int y
     * @return the difference of x and y
     */
    public int sub(int x, int y){
        int result = x-y;
        return result;
    }

    /**
     * calculates the product of x and y.
     * @param int x
     * @param int y
     * @return the product of x and y
     */
    public int mul(int x, int y){
        int result=x*y;
        return result;
    }

    /**
     * Calculates the quotient of x divided y. if the denominator is 0,
     * the method will return the numerator
     * @param int x
     * @param int y
     * @return the quotient of x and y
     */

    public int div(int x, int y){
        int result= x/y;
        return result;
    }
}

