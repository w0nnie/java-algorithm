import java.util.*;
import java.util.stream.Collectors;

class Solution {
        public long solution(String expression) {

            String[] num = expression.split("[^0-9]");
            String[] operator = expression.split("[0-9]+"); // 1번째 index부터 [, -, *, -, +]
            String[] operatorExample = {"*", "-", "+"};
            String [][] operatorArr = new String[6][3];
            int index = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(i == j) continue;

                    for (int k = 0; k < 3; k++) {
                        if(i == k || j == k) continue;

                        operatorArr[index][0] = operatorExample[i];
                        operatorArr[index][1] = operatorExample[j];
                        operatorArr[index][2] = operatorExample[k];
                        index++;
                    }
                }
            }

            Long[] answerArr = new Long[operatorArr.length];
            for (int i = 0; i < operatorArr.length; i++) {
                Long calc = calc(num, operator, operatorArr[i]);
                answerArr[i] = calc;
            }

            return Collections.max(Arrays.asList(answerArr));
        }


        //계산하는 로직 operatorArr의 순서대로 로직을 계산하는것임.
        // 연산자, 피연산자를 담은 배열의 복사본(ArrayList)을 만든다.
        // 연산자는  피연산자를 2개 골라야하는데, 자신의 index와 index+1를 골라 계산한다.
        // 연산자의 index가 0이라면 피연산자가 2개의 index 0, 1이 된다.
        // 계산이 된 후 사용한 피연산를 복사본에서 제거한다.
        // 계산이 된 피연산자는 첫번쨰 index와 같은 index로 위치시킨다.
        // 수식이 남아있을때까지 반복한다.
        public static Long calc(String[] num, String[] operator, String[] operatorRules) {
            // 복사본
            List<Long> numList = Arrays.stream(num).map(Long::parseLong).collect(Collectors.toList());
            List<String> operatorList = new ArrayList<>(Arrays.asList(operator));

            for (int i = 0; i < operatorRules.length; i++) {
                String oper = operatorRules[i];

                while (operatorList.contains(oper)) {

                    int operIndex = operatorList.indexOf(oper) - 1;
                    Long num1 = numList.get(operIndex);
                    Long num2 = numList.get(operIndex + 1);

                    if(oper.equals("*")) {
                        numList.set(operIndex, num1 * num2);
                        numList.remove(operIndex + 1);
                    } else if(oper.equals("-")) {
                        numList.set(operIndex, num1 - num2);
                        numList.remove(operIndex + 1);
                    } else if(oper.equals("+")) {
                        numList.set(operIndex, num1 + num2);
                        numList.remove(operIndex + 1);
                    }
                    operatorList.remove(operIndex + 1);
                }
            }

            return Math.abs(numList.get(0));
        }
    }