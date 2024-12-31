import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {

            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (String s : set) {
            System.out.println(s);
        }
    }
}
