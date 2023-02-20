class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int k = 0;
        while(k < number.length - 2){
            for(int i = k+1; i < number.length; i++){
                for(int j = i+1; j < number.length; j++){
                    if(number[k] + number[i] + number[j] == 0) answer++;
                }
            }
            k++;
        }
        return answer;
    }
}