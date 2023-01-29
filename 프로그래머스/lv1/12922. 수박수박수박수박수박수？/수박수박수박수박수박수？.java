class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i = 0; i < n; i++){ // 0부터 글자의 수까지 반복문을 돌려 짝수번째는 "수" 홀수번째는 "박" 추가
            if(i%2==0){
                answer += "수";
            }
            if(i%2==1){
                answer += "박";
            }
        }
        return answer;
    }
}