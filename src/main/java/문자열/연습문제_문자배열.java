package 문자열;

public class 연습문제_문자배열 {

    /**
     * 주어진 길이 N의 int 배열 arr에서 합이 100인 서로 다른 위치의 두 원소가 존재하면
     * 1을, 존재하지 않으면 0을 반환하는 함수 func2(int arr[], int N)을 작성하라.
     * arr의 각 수는 0이상 100이하이고 N은 1000 이하이다.
     *
     *
     * func2({1, 52, 48}, 3) = 1
     * func2({50, 42}, 2) = 0
     * func2({4, 13, 63, 87}, 4) = 1
     *
     * O(N)
     */

    public static void main(String[] args) {
        System.out.println(func2(new int[]{50, 42}, 2));
    }

    private static int func2(int[] arr, int n) {
        int[] frequency = new int[101];

        for (int i : arr) {
            int a = 100 - i;
            if (frequency[a] == 1) {
                return 1;
            }
            frequency[i] = 1;
        }
        return 0;
    }
}
