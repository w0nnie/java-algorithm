class Solution {
        public String solution(int[] numbers) {
            mergeSort(numbers, 0, numbers.length - 1);

            String answer = "";
            for (int i = 0; i < numbers.length; i++) {
                if (!answer.equals("0")) {
                    answer += numbers[i] + "";
                }
            }
            return answer;
        }

        static void mergeSort(int[] numbers, int left, int right) {
            if (left >= right) return;

            int mid = (left + right) / 2;

            mergeSort(numbers, left, mid);
            mergeSort(numbers, mid + 1, right);
            merge(numbers, left, mid, right);
        }

        static void merge(int[] numbers, int left, int mid, int right) {
            int[] temp = new int[right - left + 1];

            int i = left;      // 왼쪽 배열 시작
            int j = mid + 1;   // 오른쪽 배열 시작
            int k = 0;         // temp 인덱스

            //정렬기준
            // numStr1 + numStr2 compare numStr2 + numStr1
            // ex) 910 compare 109

            while (i <= mid && j <= right) {

                int numStr1 = Integer.parseInt(numbers[i] + String.valueOf(numbers[j]));
                int numStr2 = Integer.parseInt(numbers[j] + String.valueOf(numbers[i]));

                if (numStr1 >= numStr2) {
                    temp[k++] = numbers[i++];
                } else {
                    temp[k++] = numbers[j++];
                }
            }

            while (i <= mid) {
                temp[k++] = numbers[i++];
            }

            while (j <= right) {
                temp[k++] = numbers[j++];
            }

            for (int t = 0; t < temp.length; t++) {
                numbers[left + t] = temp[t];
            }
        }
    }