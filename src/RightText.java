import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RightText {
    static <T> void text(Collection<? extends T> from , Collection<T> to)
    {
        for (T ele : from)
        {
            to.add(ele);
        }
    }
    public static void main(String[] args)
    {
        List<Object> ao = new ArrayList<>();
        List<String> as = new ArrayList<>();
        text(as , ao);
    }
}
