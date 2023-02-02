import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>(); // 스택 활용
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.size() == 0) return false;
                stack.pop();
            }
            
        }
        
        if(stack.size() != 0) answer = false;

        return answer;
    }
}