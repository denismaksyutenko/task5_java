import java.util.List;
import java.util.OptionalDouble;

public class Main {
    // середнє значення елементів %2!=0 та %5 ==0
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 435, 55, 66, 5, 2, 15, 6, 10);
        OptionalDouble avg = list.stream().filter(x -> x % 2 !=0).filter(d -> d % 5 == 0).mapToInt(Integer::intValue).average();
        System.out.println(avg.getAsDouble());
    }
}