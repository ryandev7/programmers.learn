class Solution {
    public int[] solution(String s) {
        // 이진 변환 횟수와 제거된 모든 0의 개수, 0제거 후 길이
        int[] answer = new int[2];
        
        while(s.length() > 1){
            
            int cntOne = 0;
            for(int i=0; i<s.length(); i++){
        
                if(s.charAt(i) == '0') answer[1]++;
                else cntOne++;
            }
            
            s = Integer.toBinaryString(cntOne);
            answer[0]++;
        }
        
        return answer;
    }
}