import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashMap<String, Integer> map = new HashMap<>(); // 중복체크를 위한 map
        
        for(int i = 0; i < words.length; i++){
            if(i != 0){
                String s1 = words[i-1]; // 이전/다음 단어들을 담아 비교
                String s2 = words[i];
                
                char last = s1.charAt(s1.length()-1);
                char first = s2.charAt(0);
                
                if(last != first || map.containsKey(s2)){ // 단어가 중복이거나 앞 뒤 철자가 다른경우 
                    answer[0] = i % n + 1;
                    answer[1] = i / n + 1;
                    
                    return answer;
                }
            }
            map.put(words[i], 1);
        }
        
        
        return answer;
    }
}