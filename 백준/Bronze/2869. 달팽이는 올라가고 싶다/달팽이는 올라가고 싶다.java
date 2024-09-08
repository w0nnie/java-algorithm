import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int height = sc.nextInt();
        int count;
        int temp = (height - up) % (up - down);

        if (temp == 0) {
            count = (height - up) / (up - down) + 1;
        } else {
            count = (height - up) / (up - down) + 2;
        }

        System.out.println(count);
    }
}