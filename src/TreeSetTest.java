import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args)
    {
        TreeSet<String> ts1 = new TreeSet<>(
                new Comparator<Object>() {
                    @Override
                    public int compare(Object fst, Object snd) {
                        return hashCode() > snd.hashCode() ? 1
                                : hashCode() <snd.hashCode() ? -1 :0;
                    }
                }
        );
        ts1.add("hello");
        ts1.add("wa");
        TreeSet<String> ts2 = new TreeSet<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String frist, String second) {
                        return frist.length() > second. length() ? -1
                                : frist.length() < second.length() ? 1 : 0;
                    }
                }
        );
        ts2.add("Hello");
        ts2.add("Wa");
        System.out.println(ts1);
        System.out.println(ts2);
    }
}
