import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListAlgoritm {
    public static int solution(List<Integer> list){
        int Max_value =0, index =0,val = 1;


        if( list.size() > 1E5 ) throw new IllegalArgumentException("List is too long");
        if( list.size() == 0 ) throw new IllegalArgumentException("List is empty");
        if( list == null ) throw new IllegalArgumentException("List is null");
        for(int a=0;a<list.size();a++) {
            if (list.get(a) > 0) {
                index = a;
                break;
            }
        }
        Collections.sort(list);
        if(list.get(0)< -1000000 || list.get(list.size()-1) > 1000000)
        {
            throw new IllegalArgumentException("List have to high or to low value");
        }

        if(list.size() == 1){
            if(list.get(0) == 1) return ++val;
            else return val;
        }

        for(int a= index ; a<list.size();a++){
            while(list.get(a) == val-1){
                 a++;
                 if(a == list.size()) return val;
            }
            if(list.get(a) == val){
                val++;
                }
                else{ return val; }
        }



        return val;
    }
}
