class Solution {
    public int[] solution(int n) {
        int[][] arr = new int[n][n];
        int num = 1;
        int row = 0;
        int col = 0;
        arr[row][col] =num;
        while (true) {
            //아랫쪽으로
            if(n == 1) break;

            for (int i = row+1; i < n; i++) {
                if(arr[i][col] != 0) break;
                arr[i][col] = ++num;
                if(row < n-1) row++;
            }
            if(arr[row][col+1] != 0 ) break;

            //오른쪽으로
            for (int i = col+1; i < n; i++) {
                if(arr[row][i] != 0) break;
                arr[row][i] = ++num;
                if(col < n-1) col++;
            }
            if(arr[row-1][col-1] !=0) break;
            
            //왼쪽 위로
            for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
                if(arr[i][j] != 0) break;
                arr[i][j] = ++num;
                if(row > 0) row--;
                if(col > 0) col--;
            }

            if(arr[row+1][col] != 0) break;

        }
        //배열 사이즈용 변수
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    count++;
                }
            }
        }
        int[] answer = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    answer[index++] = arr[i][j];
                }
            }

        }

        return answer;
    }
}