import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.TreeBidiMap;

public class Mainos {
    public static void main(String[] args) {
        BidiMap bidi = new TreeBidiMap();
        System.out.println("Shalom ganuvos");
        System.out.println(bidi.toString());
    }
}