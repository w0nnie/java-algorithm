import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        get666(num);
    }

    private static void get666(int num) {
        int count = 0;
        int startNum = 666;
        while (count != num) {
            if (String.valueOf(startNum).contains("666")) {
                count++;
                if (count != num) {
                    startNum++;
                }
            } else {
                startNum++;
            }
        }

        System.out.println(startNum);
    }
}
