import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int numLength;
    private static int ans;
    private static String userInput;
    public static void main(String[] args) {
        
        //N의 범위 밖의 값이 입력되면 재입력
        numLength = sc.nextInt();
        while(!rangeN(numLength)){
            numLength = sc.nextInt();
        }
        //numLength와 userInput의 length가 상이하거나 userInput에 공백 포함이면 재입력
        userInput = sc.next();
        while(!(numCount(userInput) == numLength) && blankCheck(userInput)){
            userInput = sc.next();
        }
        //핵심로직 print
        System.out.println(totalSum(userInput));
    }

    private static boolean rangeN(int num){
        if(num >= 1 && num <= 100) return true;
        return false;
    }

    private static int numCount(String num){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length() ; i++) {
            list.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }
        return list.size();
    }

    private static boolean blankCheck(String num){
        if(num.contains(" ")) return false;
        return true;
    }

    private static int totalSum(String num){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num.length() ; i++) {
            list.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }

        return list.stream().reduce(0, Integer::sum);
    }
}
