import java.util.List;
import java.util.ArrayList;
public class List_ {
    public static void main(String[] args){
        List<String> nameList = new ArrayList<>();
      
        nameList.add("Ram");
        nameList.add("Sudeep");

        for(int i = 0; i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }

        nameList.remove(0);
        nameList.remove("Sudeep");

        for(int i = 0; i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }
    }
}
