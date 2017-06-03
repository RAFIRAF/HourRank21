/**
 * Created by Rafal on 02017-06-03.
 */

import java.util.Scanner;

public class JavaSolution {

    static int whoGetsTheCatch(int n, int x, int[] X, int[] V) {
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = Math.abs(
                    x - X[i]
            ) / V[i];
        }
        if (frequency(times, min(times)) > 1) {
            return -1;
        } else {
            return indexOf(times, min(times));
        }
    }

    static int indexOf(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
    }

    static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    static int frequency(int[] array, int x) {
        int freq = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                freq++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the index of the catcher who gets the catch, or -1 if no one gets the catch.
        int n = in.nextInt();
        int x = in.nextInt();
        int[] X = new int[n];
        for (int X_i = 0; X_i < n; X_i++) {
            X[X_i] = in.nextInt();
        }
        int[] V = new int[n];
        for (int V_i = 0; V_i < n; V_i++) {
            V[V_i] = in.nextInt();
        }
        int result = whoGetsTheCatch(n, x, X, V);
        System.out.println(result);
    }
}
