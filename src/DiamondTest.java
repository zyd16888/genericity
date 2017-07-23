import java.util.*;

public class DiamondTest {
    public static void main(String[] args)
    {
        List<String> books = new ArrayList<>();
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");

        for(int i=0 ; i<books.size() ; i++)
        {
            String name = books.get(i);
            System.out.println("book:" + name);
        }

        Map<String , List<String>> schoolsInfo = new HashMap<>();
        List<String> schools = new ArrayList<>();
        schools.add("斜月三星洞");
        schools.add("西天取经路");
        schoolsInfo.put("孙悟空" , schools);

        Set<String> set=schoolsInfo.keySet();
        Iterator<String> ite=set.iterator();
        while(ite.hasNext())
        {
            String str=ite.next();
            System.out.println(str+" = "+schoolsInfo.get(str));
            System.out.println(str);
            System.out.println(schoolsInfo.get(str));
        }

    }
}
