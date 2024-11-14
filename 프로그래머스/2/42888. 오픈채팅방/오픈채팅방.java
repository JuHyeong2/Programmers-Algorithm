import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] record) {
        // 입장, 퇴장, 수정만 배열로 따로 구하기
        ArrayList<String> enLeChArr = new ArrayList<String>();
        // 유저아이디만 배열로 따로 구하기
        ArrayList<String> userIdArr = new ArrayList<String>();
        // 유저 닉네임만 배열로 따로 구하기
        ArrayList<String> userNameArr = new ArrayList<String>();
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i = 0; i < record.length; i++){
            String[] str = record[i].split(" ");
            if(str.length == 3){
                enLeChArr.add(str[0]);
                userIdArr.add(str[1]);
                userNameArr.add(str[2]);    
                map.put(userIdArr.get(i), userNameArr.get(i));
            }else{
                enLeChArr.add(str[0]);
                userIdArr.add(str[1]);
                userNameArr.add("");        
            }
            
        }
        ArrayList<String> answer = new ArrayList<String>();
        
        // 결과값 저장해주기
        for(int i = 0; i < userIdArr.size(); i++){
            if(enLeChArr.get(i).equals("Enter")){
                answer.add(map.get(userIdArr.get(i)) + "님이 들어왔습니다.");    
                        
            }else if(enLeChArr.get(i).equals("Leave")){
                answer.add(map.get(userIdArr.get(i)) + "님이 나갔습니다.");
            }
            
        }
        
        return answer;
    }
}
