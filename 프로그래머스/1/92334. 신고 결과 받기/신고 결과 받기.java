import java.util.*;

class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            Map<String, Set<String>> reportMap = new HashMap<>();

            for (String record: report) {
                String[] parts = record.split(" ");
                String reporting = parts[0];
                String reported = parts[1];

                reportMap.putIfAbsent(reporting, new HashSet<>());
                reportMap.get(reporting).add(reported);
            }

            Map<String, Integer> reportCount = new HashMap<>();

            for (Set<String> reporting : reportMap.values()) {
                for (String name : reporting) {
                    reportCount.put(name, reportCount.getOrDefault(name, 0) + 1);
                }
            }

            Set<String> banSet = new HashSet<>();

            for (String name : reportCount.keySet()) {
                if(reportCount.get(name) >= k) banSet.add(name);
            }

            int[] answer = new int[id_list.length];

            for (int i = 0; i < id_list.length; i++) {
                int count = 0;
                String user = id_list[i];

                for (String reportName : reportMap.getOrDefault(user, Collections.emptySet())) {
                    if(banSet.contains(reportName)) count++;
                }
                answer[i] = count;
            }

            return answer;
        }
    }