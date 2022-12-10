import java.util.List;

public class task5_4 {
// конкарація рядковим типом чисел
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        StringBuilder str = new StringBuilder();
        list.stream().forEach(i -> str.append(Integer.toString(i)));
        System.out.println(str);
        //System.out.println(list);
    }
}
