import java.util.HashMap;
import java.util.Map;

class Solution {
        public int solution(String skill, String[] skill_trees) {

            char[] skillRule = skill.toCharArray();
            Map<Character, Integer> skillMap = new HashMap<>();
            
            //skill과 순서를 체크하기위해 Map 활용
            for (int i = 0; i < skillRule.length; i++) {
                skillMap.put(skillRule[i], i + 1);
            }

            int answer = 0;
            for (String skillTree : skill_trees) {
                // 캐릭터타입의 1차원배열로 skillTree 분리
                char[] skillTreeCharArray = skillTree.toCharArray();
                //스킬 순서 체크 변수
                int flag = 1;
                boolean isValid = true;
                
                for (char skillChar : skillTreeCharArray) {
                    //skillTree의 요소가 map에 포함되었는지 체크
                    if (skillMap.containsKey(skillChar)) {
                        if(skillMap.get(skillChar) == flag){
                            flag++;
                        } else {
                            isValid = false;
                            break;
                        }
                    }
                }
                if (isValid) {
                    answer++;
                }
            }
            return answer;
        }
    }