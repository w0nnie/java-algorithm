import java.util.*;    

class Solution {
        public String[] solution(String[] orders, int[] course) {

            // 최종 결과 저장용
            List<String> result = new ArrayList<>();

            for (int i = 0; i < course.length; i++) {
                int courseNum = course[i];
                Map<String ,Integer> courseMap = new HashMap<>();
                for (int j = 0; j < orders.length; j++) {
                    char[] order = orders[j].toCharArray();
                    // 테스트1, 2의 원소값들은 사전순으로 정렬이되어있는 문자열이지만 테스트3의경우 정렬이안되어있음.
                    // 캐릭터 형태로 쪼개고 정렬이 필요
                    Arrays.sort(order);

                    //재귀메서드
                    recursion(courseNum, order, 0, "",  courseMap);
                }

                // course당 가장 큰 value 채택
                int max = 0;
                
                // 최소 2명 이상 시킨 메뉴 조합
                for (int count : courseMap.values()) {
                    if (count >= 2) {
                        max = Math.max(max, count);
                    }
                }

                // max value에 해당하는 모든 조합 채택
                for (Map.Entry<String, Integer> entry : courseMap.entrySet()) {
                    if (entry.getValue() == max && max >= 2) {
                        result.add(entry.getKey());
                    }
                }
            }

            // 배열의 각 원소에 저장된 문자열 또한 알파벳 오름차순으로 정렬되어야 함
            Collections.sort(result);
            return result.toArray(new String[0]);
        }

        public void recursion(int course, char[] order, int index, String combi, Map<String ,Integer> courseMap) {

            if (combi.length() == course) {
                courseMap.put(combi, courseMap.getOrDefault(combi, 0) + 1);
                return;
            }

            for (int i = index; i < order.length; i++) {
                char orderChar = order[i];
                recursion(course, order, i+1, combi + orderChar, courseMap);
            }
        }
    }