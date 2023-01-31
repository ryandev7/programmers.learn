class Solution {
    public long solution(long price, long money, long count) {
        long answer = -1;
        
        long tmp = price * (count * (count+1) / 2); // ex) (3+6+9+12) = 3(1+2+3+4) = 3(등차수열의 합)
        
        if(money - tmp >= 0){
            
            return 0;
            
        }else{
            
            answer = (money - tmp) * -1;
            
        }

        return answer;
    }
}