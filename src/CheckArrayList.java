import java.lang.reflect.Method;
import java.util.ArrayList;

public class CheckArrayList {
    public static void main(String[] args) throws Exception{
        ArrayList list=new ArrayList();
        ArrayList<String> list2=new ArrayList<>();
        Class c1=list.getClass();
        Class c2=list.getClass();
        System.out.println(c1==c2);
        /*
         * 返回值为true说明在集合中的泛型是为了方便程序员进行检验错误
         * 下面通过反射对于集合中的list泛型进行分析
         */
        Method m1=c1.getDeclaredMethod("add", Object.class);
        Method m2=c2.getDeclaredMethod("add", Object.class);
        m1.invoke(list, new Integer(1));
        m1.invoke(list2, new Integer(2));//加入integer类型
        m1.invoke(list2, "xas");//加入String类型
        m1.invoke(list2, new Double(0));//加入double类型
        System.out.println(list2.size());//返回长度
        System.out.println(list2.toString());

    }
}
