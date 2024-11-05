import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        String temp = "";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int key = 0;
        for(String s : players){
            map.put(s, key);    
            key++;
        }
        
        for(String s1 : callings){
            int no = map.get(s1);
            temp = players[no-1];
            players[no-1] = players[no];
            players[no] = temp;
            
            map.put(s1, no-1);
            map.put(temp, no);   
        }
        
        return players;
    }
}