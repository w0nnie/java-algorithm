import java.util.*;

class FiedlData{
    private int numLength;
    private int ans;
    private String userInput;


    public int getNumLength() {
        return numLength;
    }

    public void setNumLength(int numLength) {
        if(numLength > 100) return;
        this.numLength = numLength;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int numLength;
    private static int ans;
    private static String userInput;
    public static void main(String[] args) {
        FiedlData fd = new FiedlData();
        inputNumLength(fd);
        userInput = sc.next();
        System.out.println(parseAndSum(fd));
    }

    private static void inputNumLength(FiedlData fd) {
        fd.setNumLength(Integer.parseInt(sc.next()));
        while(fd.getNumLength() == 0){
            inputNumLength(fd);
        }
    }

    /**
     * String으로 입력받은 userInput 변수를
     * char -> String -> Int
     * ans 변수에 누적
     * @return
     */
    private static int parseAndSum(FiedlData fd) {
        for (int i = 0; i < fd.getNumLength() ; i++) {
            ans += Integer.parseInt(String.valueOf(userInput.charAt(i)));
        }
        return ans;
    }
}
