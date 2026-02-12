import java.util.*;

class Solution {
        public int[] solution(String[] info, String[] query) {
            Map<String, List<Integer>> profile = new HashMap<>();

            for (String man : info) {
                String[] personalProfile = man.split(" ");
                int codingTestScore = Integer.parseInt(personalProfile[4]);

                for (int i = 0; i < 16; i++) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < 4; j++) {

                        if ((i & (1 << j)) != 0) {
                            sb.append("-");
                        } else {
                            sb.append(personalProfile[j]);
                        }
                    }
                    profile.putIfAbsent(sb.toString(), new ArrayList<>());
                    profile.get(sb.toString()).add(codingTestScore);
                }
            }
            
            //점수리스트 정렬
            for (List<Integer> scoreList : profile.values()) {
                Collections.sort(scoreList);
            }

            //query 가공
            int[] answer = new int[query.length];
            for (int i = 0; i < query.length; i++) {
                String[] parts = query[i].split(" ");
                int searchCodingTestScore = Integer.parseInt(parts[7]);

                // and 제외
                // 0          2           4         6
                //java and backend and junior and pizza
                String key = parts[0] + parts[2] + parts[4] + parts[6];

                List<Integer> scoreList = profile.get(key);
                if (scoreList == null) {
                    answer[i] = 0;
                    continue;
                }
                int left = 0;
                int right = scoreList.size();

                while(left < right) {
                    int mid = (left + right) / 2;

                    if (scoreList.get(mid) < searchCodingTestScore) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                answer[i] = scoreList.size() - left;
            }

            return answer;
        }
    }