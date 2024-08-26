package 연결리스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ5397_키로커 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            String a = br.readLine();
            int index = 0;
            for (int j = 0; j < a.length(); j++) {
                char b = a.charAt(j);
                switch (b) {
                    case '<':
                        if (index > 0) {
                            index -= 1;
                        }
                        break;
                    case '>':
                        if (index < list.size()) {
                            index += 1;
                        }
                        break;
                    case '-':
                        if (index > 0) {
                            list.remove(--index);
                        }
                        break;
                    default:
                        list.add(index, String.valueOf(b));
                        index++;
                        break;
                }
            }
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j));
            }
        }
    }
}
