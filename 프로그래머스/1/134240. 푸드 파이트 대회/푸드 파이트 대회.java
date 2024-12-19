class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        int count = 1;
        for(int i=1; i<food.length; i++){
            for(int j=1; j<=food[i]/2; j++){
                answer += count+"";
            }
            count++;
        }
        
        answer += "0";
        for(int i=food.length-1; i>0; i--){
            count--;
            for(int j=1; j<=food[i]/2; j++){
                answer += count+"";
            }
            
        }
        
        return answer;
    }
}