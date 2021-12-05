import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'countMax' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts STRING_ARRAY upRight as parameter.
     */

    public static long countMax(List<String> upRight) {
    //
    long x = 1;
    long y = 1;
    String strX = upRight.get(1).split(" ")[0];
    String strY = upRight.get(1).split(" ")[1];
    x = Integer.parseInt(strX);
    y = Integer.parseInt(strY);
    for (int i = 0; i < upRight.size(); i++){
        strX = upRight.get(i).split(" ")[0];
        strY = upRight.get(i).split(" ")[1];

        if (x > Integer.parseInt(strX))
            x = Integer.parseInt(strX);
        if (y > Integer.parseInt(strY))
            y = Integer.parseInt(strY);
    }
    return (x * y);
    
    }

}

public class TwoDim {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int upRightCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> upRight = IntStream.range(0, upRightCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        long result = Result.countMax(upRight);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
