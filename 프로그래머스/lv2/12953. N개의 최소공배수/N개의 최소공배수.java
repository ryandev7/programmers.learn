class Solution {

    public int solution(int[] arr) {
        // 최대공약수 / 유클리드 호제법 사용, 최소공배수 = 두 수의 곱 / 최대공약수
        int answer = arr[0]; 
        for(int i = 1; i < arr.length; i++){
            int gcd = gcd(answer, arr[i]); // 차례대로 최대공약수 값을 구함
            answer = answer * arr[i] / gcd; // 순서대로 최소공배수 값을 구함
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        
        while(x % y != 0){ // 유클리드 호제법
            int r = x % y;
            x = y;
            y = r;
        }
        return y; 
    }
}