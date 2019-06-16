import java.util.Arrays;

public class Utils {
    public static void printClass(Object[] objects){
        Arrays.asList(objects).forEach(o -> {
            System.out.println(o.toString());
            System.out.println();
        });
    }
}
