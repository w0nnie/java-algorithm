import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howManyScore = Integer.parseInt(br.readLine());
        int[] scoreArr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double maxScore = Arrays.stream(scoreArr).max().getAsInt();
        double answer = 0;
        for (double score : scoreArr) {
            answer += score / maxScore * 100;
        }
        System.out.println(answer / howManyScore);
    }
}