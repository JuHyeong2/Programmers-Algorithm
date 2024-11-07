import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        ArrayList<Integer> al = new ArrayList<>(set);
        Collections.sort(al);
        int[] answer = new int[al.size()];
        int index = 0;
        for(Integer i : al){
            answer[index] = i; 
            index++;
        }
        // Iterator<Integer> it = set.iterator();
        // while(it.hasNext()){
        //     al.add(it.next());
        // }
        
        return answer;
    }
}