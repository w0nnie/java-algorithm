import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int cardNum[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cardNum[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cardNum);
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int compareNum = binarySearchMethod(Integer.parseInt(st.nextToken()), cardNum);
            if (compareNum != -1) System.out.print(1 + " ");
            else System.out.print(0 + " ");
        }
    }

    private static int binarySearchMethod(int compareNum, int[] cardNum) {
        int left = 0;
        int right = cardNum.length-1;
        int mid;

        while (left <= right) {
            mid = (right + left) / 2;
            if (cardNum[mid] < compareNum) {
                left = mid + 1;
            } else if (cardNum[mid] > compareNum) {
                right = mid - 1;
            } else if (cardNum[mid] == compareNum) {
                return mid;
            }
        }
        return -1;
    }
}
