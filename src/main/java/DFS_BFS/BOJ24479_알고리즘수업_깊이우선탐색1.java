package dfs_bfs;


import java.util.Scanner;

public class BOJ24479_알고리즘수업_깊이우선탐색1 {
    static int n;
    static int m;
    static int[] answer;
    static boolean[] visited;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int startNode = sc.nextInt();
        answer = new int[n];

        arr = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int stNode = sc.nextInt();
            int endNode = sc.nextInt();
            arr[stNode][endNode] = 1;
            arr[endNode][stNode] = 1;
        }
         visited = new boolean[n + 1];
        dfs(startNode);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    private static void dfs(int startNode) {
        visited[startNode] = true;
        answer[startNode - 1] = startNode;
        for (int j = 0; j < arr.length; j++) {
            if (arr[startNode][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }
}

