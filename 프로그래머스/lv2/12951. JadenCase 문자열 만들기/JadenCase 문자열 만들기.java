class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase(); // 모두 소문자로 변경
        
        StringBuffer sb = new StringBuffer();
        
        sb.append(Character.toUpperCase(s.charAt(0))); // 첫 글자를 대문자로 바꾸어 버퍼에 저장
        
        for(int i = 1; i < s.length(); i++){ // 두번째 문자부터 비교 시작
            
            if(s.charAt(i) == ' ') sb.append(" "); 
            
            else if(s.charAt(i-1) == ' '){ // 이전 문자가 공백이었다면 다음 문자 대문자로 변경
                
                sb.append(Character.toUpperCase(s.charAt(i)));
                
            }else{
                
                sb.append(s.charAt(i));
                
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}