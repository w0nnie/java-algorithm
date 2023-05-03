package 정렬;

public class main {

    public static void main(String[] args) {
        int n = 3;
        reculsive(n);
    }

    private static void reculsive(int n) {
        if (n == 0) {
            return ;
        }
        reculsive(n - 1);
        //return에서 돌아온 다음에 실행되는 구문
        //재귀호출의 위에 구문 == 호출이 수행전
        //재귀 호출 아래구문 == 모든 return이 돌아오고 수행하는 구문
        System.out.println(n);
    }
}
