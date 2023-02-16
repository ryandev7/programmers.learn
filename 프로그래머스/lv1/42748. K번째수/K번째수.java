import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int n = 0;
        
        for(int i = 0; i < commands.length; i++){
            
            int[] tmp = new int[commands[i][1] - commands[i][0] + 1];
            int k = 0;
            
            for(int j = commands[i][0]; j <= commands[i][1]; j++){
                
                tmp[k++] = array[j - 1];
            }
            Arrays.sort(tmp);
            answer[n++] = tmp[commands[i][2] - 1];
        }
        
        return answer;
    }
        
    
}