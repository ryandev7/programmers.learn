class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true){
            // 가지고 있는 빈 병 개수가 a개 보다 미만이면 반환
            if(n < a) break;
            
            // 빈 병의 개수가 a개 보다 크면 반복
            answer += (n / a) * b;
            
            int remain = n % a;
        
            n = (n / a) * b + remain;
        }
        
        return answer;
    }
}