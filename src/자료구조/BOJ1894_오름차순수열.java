package 자료구조;

import java.util.Scanner;
import java.util.Stack;

public class BOJ1894_오름차순수열 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //수열의 개수
        int[] A = new int[N]; //수열 저장 배열
        for(int i =0; i<N; i++){
            A[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1; // 오름차순
        boolean result = true;
        for (int i=0; i<A.length; i++){
            int su =A[i];
            if(su >=num){
                while(su >= num){
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else{
                int n = stack.pop();
                if(n >su){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }
        if(result){
            System.out.println(bf.toString());
        }
    }
}
