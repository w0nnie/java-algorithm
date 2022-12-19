package 자료구조;

import java.util.Scanner;
import java.util.Stack;

public class BOJ9012_괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //6
        for (int i = 0; i < num; i++) {
            solve(sc.next());
        }
    }
    public static void solve(String str){
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < str.length(); j++) {
            if(str.charAt(j) == '('){
                stack.push(str.charAt(j));
            }else if(str.charAt(j) == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    System.out.println("NO");
                }
            }else{
                if(stack.isEmpty()){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
