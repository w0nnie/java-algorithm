package DFS_BFS;

import java.util.*;

public class BOJ2644_촌수계산 {
    private static int relationCount = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int firstPeople = sc.nextInt();
        int secondPeople = sc.nextInt();
        int relation = sc.nextInt();
        List<List<Integer>> kinshipList = new ArrayList<>();
        Boolean[] visited = new Boolean[people + 1];
        List<Integer> answerList = new ArrayList<>();
        Arrays.fill(visited, false);
        for (int i = 0; i < people + 1; i++) {
            kinshipList.add(new ArrayList<>());
        }

        for (int i = 0; i < relation; i++) {
            int startNode = sc.nextInt();
            int endNode = sc.nextInt();
            kinshipList.get(startNode).add(endNode);
            kinshipList.get(endNode).add(startNode);
        }
        
        //2차원 리스트 정렬
        Comparator<List<Integer>> comp = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        };

        for (List<Integer> list : kinshipList) {
            Collections.sort(list);
        }
        dfs(firstPeople, secondPeople, kinshipList, visited, 0);
        System.out.println(relationCount);
    }

    private static void dfs(int firstPeople, int secondPeople, List<List<Integer>> kinshipList, Boolean[] visited, int count) {
        visited[firstPeople] = true;

        for (int i = 0; i < kinshipList.get(firstPeople).size(); i++) {
            int nextNode = kinshipList.get(firstPeople).get(i);
            if (!visited[nextNode]) {
                if (nextNode == secondPeople) {
                    relationCount = count + 1;
                    return;
                }
                dfs(nextNode, secondPeople, kinshipList, visited, count + 1);
            }
        }
    }
}
//    private static void bfs(int firstPeople, int secondPeople, List<List<Integer>> kinshipList, Boolean[] visited) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(firstPeople);
//        visited[firstPeople] = true;
//        int relationCount = 0;
//        while (!queue.isEmpty()) {
//            int nowNode = queue.poll();
//
//            if (nowNode == secondPeople) {
//                System.out.println(relationCount);
//            } else if (relationCount == 0) {
//                System.out.println(-1);
//            }
//            for (int i = 0; i < kinshipList.get(nowNode).size(); i++) {
//                int nextNode = kinshipList.get(nowNode).get(i);
//                if (!visited[nextNode]) {
//                    queue.offer(nextNode);
//                    visited[nextNode] = true;
//                    relationCount += 1;
//                }
//            }
//        }
//    }
