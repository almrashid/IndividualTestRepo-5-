import java.util.ArrayList;
import java.util.List;

public class UseArrayList {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);

        for (Object num:list) {
            System.out.println(num);
        }
    }
}
