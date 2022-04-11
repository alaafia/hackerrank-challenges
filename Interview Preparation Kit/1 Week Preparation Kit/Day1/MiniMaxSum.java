import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class MiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int minSum = 0;
    int maxSum = 0;
    arr.sort(Comparator.naturalOrder());
    for (int i=0 ; i < 4 ; i++) {
        minSum += arr.get(i);
    }
    for (int i=1 ; i <= 4 ; i++) {
        maxSum += arr.get(i);
    }
    System.out.println(minSum + " " +maxSum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        MiniMaxSum.miniMaxSum(arr);

        bufferedReader.close();
    }
}
