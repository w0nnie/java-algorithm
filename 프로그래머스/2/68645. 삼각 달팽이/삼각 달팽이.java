import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        //종료지점 만드는 메서드
        int[] endpointArray = new int[n+1];
        int endPoint = getEndPoint(endpointArray, n);
        
        int[][] board = new int[n][n];
        
        // 배열 채우는 메서드
        fillArray(board, endPoint, n);
        
        int[] answer = new int[endPoint];
        int index = 0;
        
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j <board[i].length; j++){
                if(board[i][j] !=0){
                    answer[index++] = board[i][j];
                }
            }
        }
        
        return answer;
    }
    
    public static void fillArray(int[][] board, int endPoint, int n) {
        
        int num = 2;
        int col = 0;
        int row = 0;
        board[row][col] = 1;
        int dir = 0;
        while(num <= endPoint){
            
            switch(dir){
                case 0: // 아래
                    while(row+1 < n && board[row+1][col] == 0){
                        board[row+1][col] = num;
                        row+=1;
                        num+=1;
                    }
                    dir = 1;
                    break;
                case 1: // 오른쪽
                    while(col+1 < n && board[row][col+1] == 0){
                        board[row][col+1] = num;
                        col+=1;
                        num+=1;
                    }
                    dir = 2;
                    break;
                case 2: // 대각선    
                    while(row-1 < n && 
                          col-1 < n && 
                          row-1 > 0 && 
                          col-1 >0 && 
                          board[row-1][col-1] == 0){
                        board[row-1][col-1] = num;
                        row-=1;
                        col-=1;
                        num+=1;
                    }
                    dir = 0;
                    break;
            }
        }
    }
    
    public static int getEndPoint(int[] endpointArray, int n){
        
        if(n == 1) return 1;
        
        endpointArray[1] = 1;
        endpointArray[2] = 3;
        
        int point = 3;
        while(point <= n){
            
            endpointArray[point] = endpointArray[point-1] + point;
            point++;
        }
        
        return endpointArray[n];
    }
}