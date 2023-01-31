class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // 이중 for문 사용
        
        for(int i = left; i <= right; i++){           
            int count = 0;            
            
            for(int j = 1; j <= i; j++){ // 약수 갯수 구하기
                
                if(i % j == 0) count++; 
                
            }
            
            if(count % 2 == 0) answer += i; // 갯수가 짝수면 해당 수 더하기
            else answer -= i;

        }
        
        return answer;
    }
}