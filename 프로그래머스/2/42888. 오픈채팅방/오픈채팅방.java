import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] record) {
        // 입장, 퇴장, 수정만 배열로 따로 구하기
        // String[] enLeChArr = new String[record.length];
        ArrayList<String> enLeChArr = new ArrayList<String>();
        // 유저아이디만 배열로 따로 구하기
        // String[] userIdArr = new String[record.length];
        ArrayList<String> userIdArr = new ArrayList<String>();
        // 유저 닉네임만 배열로 따로 구하기
        // String[] userNameArr = new String[record.length];
        ArrayList<String> userNameArr = new ArrayList<String>();
        HashMap<String, String> map = new HashMap<String, String>();
        int count = 0;
        for(int i = 0; i < record.length; i++){
            String[] str = record[i].split(" ");
            if(str.length == 3){
                enLeChArr.add(str[0]);
                userIdArr.add(str[1]);
                userNameArr.add(str[2]);    
                map.put(userIdArr.get(i), userNameArr.get(i));
                count ++;
            }else{
                enLeChArr.add(str[0]);
                userIdArr.add(str[1]);
                userNameArr.add("");        
            }
            
        }
        // String[] answer = new String[count];
        ArrayList<String> answer = new ArrayList<String>();
        // System.out.println("출력1");
        // String userId = "";
        // int index = 0;
        // 유저가 몇명인지 찾기
        // HashMap<String, String> map = new HashMap<String, String>();
        // for(String s : userIdArr){
        //     set.add(s);
        //     // System.out.println(s);
        // }
        
        // for(int i = 0; i < userIdArr.length; i++){
        //     map.put(userIdArr[i], userNameArr[i]);
        // }
        
        // 중복 없앤 유저 배열에 넣어주기
//         String[] userIdArr2 = new String[set.size()];
//         Iterator<String> it = set.iterator();
//         int index2 = 0;
//         while(it.hasNext()){
//             userIdArr2[index2] = it.next();
//             // System.out.println(userIdArr2[index2]);
//             index2++;
//         }
        
//         // set.clear();
        
//         // 마지막으로 바꾼 유저 닉네임 배열 변수 선언
//         String[] userNameArr2 = new String[set.size()];
        
//         // 마지막으로 바꾼 유저 닉네임 배열에 저장
//         for(int j = 0; j < userIdArr2.length; j++){
//             for(int i = enLeChArr.length-1; i >= 0; i--){
//                 if(userIdArr2[j].equals(userIdArr[i])){
//                     userNameArr2[j] = userNameArr[i];
//                     // System.out.println(i);
//                     // System.out.println(userNameArr[i]);
//                     // System.out.println(userNameArr2[j]);
//                     break;
//                 }
//             }
//         }
        
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