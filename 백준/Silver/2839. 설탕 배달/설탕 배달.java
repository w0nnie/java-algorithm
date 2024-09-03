import java.util.Scanner;

public class Main {
    private static final int THREE_KG = 3;
    private static final int FIVE_KG = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(getAnswer(num));
    }

    private static int getAnswer(int num) {
        int count = 0;

        while (num > 0) {
            if (num % FIVE_KG == 0) {
                count += num / FIVE_KG;
                num = 0;
                break;
            } else {
                num -= THREE_KG;
                count++;
            }
        }

        if (num != 0) {
            return -1;
        }

        return count;
    }

}
