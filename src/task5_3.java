import java.util.HashMap;
import java.util.Map;

public class task5_3 {
    //сума ключів рядків з кількістю символів <7
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("asdfgh", 3);
        map.put("asdfghj1", 4);
        map.put("asdfg", 8);
        map.put("asdfghj1", 1);
        map.put("asdfghj", 6);
        map.put("asdwgh", 3);
        int sum = 0;
        for (Map.Entry<String, Integer> e: map.entrySet()){
            if (e.getKey().length()<7)
                //System.out.println(e.getValue());
                sum+=e.getValue();
        }
        System.out.println(sum);
    }
}
