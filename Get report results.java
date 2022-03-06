import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // 배열을 HashSet으로 변환
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        // HashSet을 배열로 변환
        String[] Report = hashSet.toArray(new String[0]);
        
        //String[] report1 = new String[report.length()*2];
        //String[] listReport1 = new String[Report.length];
        //String[] listReport2 = new String[Report.length];
        ArrayList<String> ListReport1 = new ArrayList<>();
        ArrayList<String> ListReport2 = new ArrayList<>();
        for(int i=0; i<Report.length; i++){
            String[] report1 = Report[i].split(" ");
            if(report1[0].equals(report1[1])){
                continue;
            }
            ListReport1.add(report1[0]);
            ListReport2.add(report1[1]);
        }
        
        String[] listReport1 = ListReport1.toArray(new String[ListReport1.size()]);
        String[] listReport2 = ListReport2.toArray(new String[ListReport2.size()]);
        
        //ArrayList<String> ListReport2 = new ArrayList<>(Arrays.asList(listReport2));
        int[] count = new int[id_list.length];
        ArrayList<Integer> index = new ArrayList<>();
        for(int j=0; j<id_list.length; j++){
            int aFrequency = Collections.frequency(ListReport2, id_list[j]);
            if(aFrequency>=k){
                for(int i=0; i<listReport2.length; i++){
                    if(listReport2[i].equals(id_list[j]))
                        index.add(i);
                }
            }
        }
        
        ArrayList<String> resultArray = new ArrayList<String>();
        for(int i : index){
            resultArray.add(listReport1[i]);
        }
        for(int i=0; i<id_list.length; i++){
            int rFrequency = Collections.frequency(resultArray, id_list[i]);
            answer[i] = rFrequency;
        }
        
        return answer;
    }
}