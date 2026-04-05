import java.util.ArrayList;
import java.util.List;

class Solution {
    static int answer = 0;
    
    public int solution(int[] info, int[][] edges) {
        List<Integer>[] tree = new ArrayList[info.length];

        for (int i = 0; i < info.length; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges.length; i++) {
            tree[edges[i][0]].add(edges[i][1]);
        }

        List<Integer> nextNodes = new ArrayList<>();
        nextNodes.add(0);

        dfs(0, 0, nextNodes, info, tree);

        return answer;
    }

    void dfs(int sheep, int wolf, List<Integer> nextNodes, int[] info, List<Integer>[] tree) {

        for (int i = 0; i < nextNodes.size(); i++) {
            int visitedNode = nextNodes.get(i);
            int kindOfAnimal = info[visitedNode];

            int newSheep = sheep;
            int newWolf = wolf;

            if(kindOfAnimal == 0) newSheep++;
            if(kindOfAnimal == 1) newWolf++;

            if(newWolf >= newSheep) continue;

            answer = Math.max(answer, newSheep);

            List<Integer> newNextNodes = new ArrayList<>(nextNodes);

            //후보node에서 방문node 제거
            newNextNodes.remove(Integer.valueOf(visitedNode));

            newNextNodes.addAll(tree[visitedNode]);
            dfs(newSheep, newWolf, newNextNodes, info, tree);
        }
    }
}