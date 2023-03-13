import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * 상수를 제외하고 전역변수 최소화
     * 하나의 기능을 가진 메서드
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(getGCD(x,y));
        System.out.println(getLCM(x,y));
    }

    /**
     * 유클리드 호제법 알고리즘을 참고하여 구현하였다.
     * 최대공약수 알고리즘
     *
     * @param x
     * @param y
     * @return
     */
    public static int getGCD(int x, int y) {
        if(y == 0) return x;
        return getGCD(y, x%y);
    }

//    public static int getGCD(int x, int y) {
//        int r;
//        while(y != 0){
//            r = x % y;
//            x = y;
//            y = r;
//        }
//        return x;
//    }

    private static int getLCM(int x, int y) {
        return x * y / getGCD(x,y);
    }
}
