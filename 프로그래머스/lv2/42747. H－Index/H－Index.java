import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        // 0 1 3 5 6
        // 0번 이상 인용한 논문 5편/ 5번 이상 인용된 논문 5개? X
        // 1번 이상 인용한 논문 4편/ 4번 이상 인용된 논문 2개
        // -> h번째 인덱스 값이 h번 이상인 것과 동일하거나 커야함 
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++){
            
            int h = citations.length - i;
            
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}