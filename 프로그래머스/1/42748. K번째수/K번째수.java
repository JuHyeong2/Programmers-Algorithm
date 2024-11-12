import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        int i = 0;
        for(int[] i1 : commands){
            tempArr.clear();
            for(int i2 = i1[0]-1; i2 <= i1[1]-1; i2++){
                tempArr.add(array[i2]);
            }
            Collections.sort(tempArr);
            answer[i] = tempArr.get(i1[2]-1);
            i++;
        }
        return answer;
    }
}