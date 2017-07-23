import java.util.ArrayList;
import java.util.List;

public class GenericList {
    public static void main(String[] args)
    {
        List<String> strList = new ArrayList<String>();
        strList.add("java讲义");
        strList.add("Android讲义");
        for(int i=0 ; i<strList.size() ; i++)
        {
            String name = strList.get(i);
            System.out.println("name:" + name);
        }
    }
}
