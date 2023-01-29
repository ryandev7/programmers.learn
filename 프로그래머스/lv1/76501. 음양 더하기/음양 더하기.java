class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] arr = new int[absolutes.length];
        
        for(int i = 0; i < absolutes.length; i++){
            if(signs[i] == true){
                arr[i] = absolutes[i];
            }else{
                arr[i] = -absolutes[i];
            }
        }
        for(int a : arr){
            answer += a;
        }
        
        return answer;
    }
}