class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(!(s.length() == 4 || s.length() == 6)) return false;
        
        for(int i = 0; i < s.length(); i++){
            
            if(!Character.isDigit(s.charAt(i))){ // 숫자가 아니면 false
                answer = false;
                return answer;
                
            }
        }
        
        return answer;
    }
}