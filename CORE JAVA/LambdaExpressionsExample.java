import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "apple", "cherry");
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted list: " + list);
    }
}