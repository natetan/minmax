package yulongproductions.com.minmax;

/**
 * Created by Yulong on 4/2/2016.
 */
public class Nums {

    public int getMax(int n) {
        // if it's a single digit, return it
        if (n / 10 == 0) {
            return n;
        } else {
            return Math.max(n % 10, getMax(n / 10));
        }
    }

    public int getMin(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return Math.min(n % 10, getMin(n / 10));
        }
    }
}
