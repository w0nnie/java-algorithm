import java.util.ArrayList;
import java.util.List;


class Solution{
        public int solution(int n, int[][] results) {

            List<Integer>[] win = new ArrayList[n + 1];
            List<Integer>[] lose = new ArrayList[n + 1];

            for (int i = 0; i <= n; i++) {
                win[i] = new ArrayList<>();
                lose[i] = new ArrayList<>();
            }

            for (int i = 0; i < results.length; i++) {
                win[results[i][0]].add(results[i][1]);
                lose[results[i][1]].add(results[i][0]);
            }

            int answer = 0;

            for (int i = 1; i < n + 1; i++) {
                boolean[] visited = new boolean[n + 1];
                int winCount = dfs(i, win, visited);
                int loseCount = dfs(i, lose, visited);
                if(winCount + loseCount ==  n - 1){
                    answer++;
                }
            }

            return answer;
        }

        int dfs(int start, List<Integer>[] graph, boolean[] visited) {
            int count = 0;

            for (int i = 0; i < graph[start].size(); i++) {
                if (!visited[graph[start].get(i)]) {
                    visited[graph[start].get(i)] = true;
                    count += 1 + dfs(graph[start].get(i), graph, visited);
                }
            }
            return count;
        }
    }