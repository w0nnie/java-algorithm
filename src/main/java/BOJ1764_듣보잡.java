import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1764_듣보잡 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        Set<String> noListen = new TreeSet<>();
        Set<String> noSaw = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            noListen.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            noSaw.add(br.readLine());
        }

        noListen.retainAll(noSaw);
        int size = noListen.size();

        System.out.println(size);
        for (String s : noListen) {
            System.out.println(s);
        }
    }
}
