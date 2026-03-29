import java.util.LinkedList;
import java.util.Queue;


class Solution {
        public int solution(int[][] maps) {
            Queue<int[]> queue = new LinkedList<>();
            int n = maps.length;
            int m = maps[0].length;
            boolean[][] visited = new boolean[n][m];

            int[] dx = {1, -1, 0, 0};
            int[] dy = {0, 0, 1, -1};

            //시작점
            queue.add(new int[]{0, 0});
            visited[0][0] = true;

            while (!queue.isEmpty()) {
                //하나 꺼낸다
                int[] now = queue.poll();
                int x = now[0];
                int y = now[1];

                //상화좌우
                /**
                 * (x+1, y) → 아래
                 * (x-1, y) → 위
                 * (x, y+1) → 오른쪽
                 * (x, y-1) → 왼쪽
                 */
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    //조건 (기존코드)
//                    if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
//                        if(maps[nx][ny] != 0) {
//                            if(!visited[nx][ny]) {
//                                visited[nx][ny] = true;
//                                queue.add(new int[]{nx, ny});
//                                maps[nx][ny] = maps[x][y] + 1;
//                            }
//                        }
//                    }

                    //리팩토링
                    // 조건
                    if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                    if (maps[nx][ny] == 0) continue;
                    if (visited[nx][ny]) continue;

                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                    maps[nx][ny] = maps[x][y] + 1;
                }
            }
            if(!visited[n-1][m-1]) {
                return -1;
            }

            return maps[n-1][m-1];
        }
    }