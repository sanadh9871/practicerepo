import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapsAndList {
    public static void main(String[] args) {
        Map<String, Integer> r = Hashreturn("Sande", 2);
        Map<String, Integer> y = r;

        System.out.println(y);
    }

    public static Map<String, Integer> Hashreturn(String x, Integer y) {

        Map<String, Integer> z = new HashMap<>();
        z.put(x,y);
            return z;

    }

}
