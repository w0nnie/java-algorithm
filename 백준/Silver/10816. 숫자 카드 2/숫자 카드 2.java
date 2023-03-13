import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[]args) throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //상근이 보유중인 카드 개수
        int hasCardNum = Integer.parseInt(stringTokenizer.nextToken());
        //상근이 보유중인 숫자카드
        int hasCards[] = new int[hasCardNum];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //상근이 보유중인 숫자카드 입력
        for (int i = 0; i < hasCardNum; i++) {
            hasCards[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        //질의 수
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int question = Integer.parseInt(stringTokenizer.nextToken());
        //key값에 적힌 숫자가 상근이 몇개가지고있는지 value에 들어간다.
        Map<Integer, Integer> questionCards = new HashMap<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        List<Integer> cardArr = new ArrayList<>();
        for (int i = 0; i < question; i++) {
            int nextCardNum = Integer.parseInt(stringTokenizer.nextToken());
            questionCards.put(nextCardNum, 0);
            cardArr.add(nextCardNum);
        }

        for (int i = 0; i < hasCards.length; i++) {
            if(questionCards.containsKey(hasCards[i])){
                int count = questionCards.get(hasCards[i]) + 1;
                questionCards.put(hasCards[i], count);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < cardArr.size(); i++) {
            int card = questionCards.get(cardArr.get(i));
            if (i == cardArr.size()-1) {
                stringBuilder.append(card);
            }else{
                stringBuilder.append(card + " ");
            }
        }
        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

}
