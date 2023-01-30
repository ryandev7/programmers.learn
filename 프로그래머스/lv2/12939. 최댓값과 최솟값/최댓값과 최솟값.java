import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] st = s.split(" ");
        
        int min = Integer.MAX_VALUE; // 최솟값을 담는 변수에 최댓값을 넣어넣고 이후에 비교
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < st.length; i++){
            int num = Integer.parseInt(st[i]);
            
            min = Math.min(num, min); // 기존의 최댓값이 담긴 값과 해당 인덱스 값을 비교해 작은 값을 min변수에 넣음 
            max = Math.max(num, max); 
            
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}