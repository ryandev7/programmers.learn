class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String bn = Integer.toBinaryString(n);
        int cnt = checkCnt(bn);
          
        while(true){
            n++;
            bn = Integer.toBinaryString(n);
            
            if(cnt == checkCnt(bn)) break;
        }
        answer = Integer.parseInt(bn, 2);
        return answer;
        
    }
    
    public int checkCnt(String n){  // 2진수 변환의 1의 갯수 메소드 생성
        int cnt = 0;
        for(int i = 0; i < n.length(); i++){
            if(n.charAt(i) == '1'){
                cnt++;
            }
        }
        return cnt;
    }
}