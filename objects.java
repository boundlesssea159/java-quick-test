import java.security.KeyStore.Entry;
import java.util.*;
import java.util.stream.Collectors;

class ObjectsExercise {
    public static void main(String[] args) {
        // 1. Replace the existing values with your own information, then add a new property named city.
        Map<String, Object> me = new LinkedHashMap<>();
        me.put("name", "Jake Overall");
        me.put("age", 29);
        me.put("hair color", "brown");

        // 2. Iterate over the object and print the property (key) names.
        //    Expected: name, age, hair color, city (order may vary)

        me.put("name", "Codi");
        me.put("age", 31);
        me.put("hair color", "black");
        me.put("city", "ShenZhen");

      System.out.println(me.entrySet().stream().map(e->e.getKey()).collect(Collectors.toList()));
    }
}
