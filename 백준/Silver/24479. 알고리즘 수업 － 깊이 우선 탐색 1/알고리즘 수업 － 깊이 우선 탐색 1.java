import java.util.*;

public class Main {
    static boolean[] visited;
    static List<Integer>[] arr;
    static int[] answer;
    static int count = 1;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int startNode = sc.nextInt();

        visited = new boolean[n + 1];
        answer = new int[n + 1];
        arr = new ArrayList[n + 1];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int stNode = sc.nextInt();
            int endNode = sc.nextInt();
            arr[stNode].add(endNode);
            arr[endNode].add(stNode);
        }

        for (int i = 0; i < arr.length; i++) {
            Collections.sort(arr[i]);
        }

        dfs(startNode);
        for (int i = 1; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    private static void dfs(int startNode) {
        visited[startNode] = true;
        answer[startNode] = count++;

        for (int i = 0; i < arr[startNode].size(); i++) {
            int nextNode = arr[startNode].get(i);
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }
}

