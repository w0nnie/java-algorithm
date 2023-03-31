
import java.util.*;

public class Main {
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