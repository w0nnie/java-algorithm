import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int k) {
        
        StringBuilder sb = new StringBuilder();
        
        //k진수로 변환
        while(n > 0){
            sb.append(n%k);
            n /= k;
        }
        
        String[] numArray = sb.reverse().toString().split("0");

        List<Long> primeNumList = new ArrayList<>();
        
        for(String num : numArray) {
            if(num.isEmpty()) continue;
            if(isPrime(Long.parseLong(num))){
                primeNumList.add(Long.parseLong(num));
            }
        }
        
        
        int answer = primeNumList.size();
        return answer;
    }
    
    public boolean isPrime(long num){
        if(num < 2) return false;
        for(long i = 2; i <= Math.sqrt(num); i++){
            
            if(num % i == 0) return false;
        }
        
        return true;
    }
}