import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int monCount = Integer.parseInt(stk.nextToken());
        int questionCount = Integer.parseInt(stk.nextToken());

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= monCount; i++) {
            String pokeMon = br.readLine();
            map.put(pokeMon, i);
            list.add(pokeMon);
        }

        for (int i = 0; i < questionCount; i++) {
            String input = br.readLine();
            boolean isNum = true;
            int pokeMonNum = 0;
            try {
                pokeMonNum = Integer.parseInt(input);
            } catch (NumberFormatException  e) {
                isNum = false;
            }

            if (isNum) {
                System.out.println(list.get(pokeMonNum - 1));
            } else {
                System.out.println(map.get(input));
            }
        }

    }
}
