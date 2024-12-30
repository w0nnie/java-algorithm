import java.io.*;
import java.util.*;

public class Main {


    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(stk.nextToken());
        int col = Integer.parseInt(stk.nextToken());
        String[][] board = new String[row][col]; 

        for (int i = 0; i < row; i++) {
            board[i] = br.readLine().split("");
        }

        int answer = Integer.MAX_VALUE;;

        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) {

                int blackCount = findBlackOrWhite(i, j, board, "B");
                int whiteCount = findBlackOrWhite(i, j, board, "W");
                int minCount = Math.min(blackCount, whiteCount);

                if (minCount < answer) {
                    answer = minCount;
                }
            }
        }
        
        System.out.println(answer);

    }


    private static int findBlackOrWhite(int i, int j, String[][] board,  String firstWord) {
        int count = 0;
        String currentWord = firstWord;

        for (int k = i; k < i + 8; k++) {
            for (int q = j; q < j + 8; q++) {
                if (!currentWord.equals(board[k][q])) {
                    count++;
                }

                currentWord = currentWord.equals("B") ? "W" : "B";
            }
            currentWord = currentWord.equals("B") ? "W" : "B";
        }
        return count;
    }
}
