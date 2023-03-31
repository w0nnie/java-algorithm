import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int start = sc.nextInt();
        List<List<Integer>> arrayDfs = new ArrayList<>();
        Queue<Integer> queueBfs = new LinkedList<>();
        Boolean visited[] = new Boolean[n + 1];
        Arrays.fill(visited,false);

        //1번 노드 부터 시작되므로 0번째 List는 비워줌
        for (int i = 0; i < n+1; i++) {
            arrayDfs.add(new ArrayList<>());
        }

        //[[], [2, 3, 4], [1, 4], [1, 4], [1, 2, 3]]
        for (int i = 0; i < m; i++) {
            int startNode = sc.nextInt();
            int endNode = sc.nextInt();
            arrayDfs.get(startNode).add(endNode);
            arrayDfs.get(endNode).add(startNode);
        }

        Comparator<List<Integer>> comp = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        };

        for (List<Integer> list : arrayDfs) {
            Collections.sort(list);
        }
        dfs(start, arrayDfs, visited);
        System.out.println();
        Arrays.fill(visited,false);
        bfs(start, queueBfs, arrayDfs, visited);

    }

    private static void dfs(int start, List<List<Integer>> arrayDfs, Boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int i = 0; i < arrayDfs.get(start).size(); i++) {
            int nextNode = arrayDfs.get(start).get(i);
            if (!visited[nextNode]) {
                dfs(nextNode, arrayDfs, visited);
            }
        }
    }

    private static void bfs(int start, Queue<Integer> queueBfs, List<List<Integer>> arrayDfs, Boolean[] visited) {
        queueBfs.offer(start);
        visited[start] = true;

        while (!queueBfs.isEmpty()) {
            int nowNode = queueBfs.poll();
            System.out.print(nowNode + " ");
            for (int i = 0; i < arrayDfs.get(nowNode).size(); i++) {
                int nextNode = arrayDfs.get(nowNode).get(i);
                if (!visited[nextNode]) {
                    queueBfs.offer(nextNode);
                    visited[nextNode] = true;
                }
            }
        }
    }
}
