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
     * Complete the 'preprocessDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
     */

    public static List<String> preprocessDate(List<String> dates) {
    List<String> result = new ArrayList<String>();
    for (int index = 0; index < dates.size(); index++){
        // Well we need to split the string date so we can get the day , the month and the year

        String[] date = dates.get(index).split(" ");
        //we will remove all the alphabet from day  by replaceAll
        String day = date[0].replaceAll("\\D", "");
        String month = date[1];
        String year = date[2];
        //convert month into digital version
        switch (month) {
            case "Jan" : month = "01";
            break;
            case "Feb" : month = "02";
            break;
            case "Mar" : month = "03";
            break;
            case "Apr" : month = "04";
            break;
            case "May" : month = "05";
            break;
            case "Jun" : month = "06";
            break;
            case "Jul" : month = "07";
            break;
            case "Aug" : month = "08";
            break;
            case "Sep" : month = "09";
            break;
            case "Oct" : month = "10";
            break;
            case "Nov" : month = "11";
            break;
            case "Dec" : month = "12";
            break;
            default : System.out.println ("someting is wrong");          
                
        }
        //we use format so we can get the format of the day  we want 0..
        result.add(year + "-"  + month + "-" + String.format("%02d", Integer.parseInt(day)));
    }
    return result;
    }

}
public class date {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int datesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dates = IntStream.range(0, datesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.preprocessDate(dates);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
