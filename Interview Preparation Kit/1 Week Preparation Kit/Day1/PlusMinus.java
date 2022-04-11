import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class PlusMinus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int positives = 0;
    int negatives = 0;
    int zeros = 0;
    int len = arr.size();
    for (int i=0; i < len; i++){
        if (arr.get(i) > 0){
            positives++;
        }
        else if (arr.get(i) < 0) {
            negatives++;
        }
        else {
            zeros++;
        }
    }
    float pos = (float)positives/len;
    float neg = (float)negatives/len;
    float zero = (float)zeros/len;
    System.out.printf("%.6f\n",pos);
    System.out.printf("%.6f\n",neg);
    System.out.printf("%.6f\n",zero);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        PlusMinus.plusMinus(arr);

        bufferedReader.close();
    }
}
