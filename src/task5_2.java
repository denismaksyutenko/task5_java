import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task5_2 {
// програма шукає та видаляє однакові рядки
    private static void task2(String str){
        String[] strings = str.split("\n");
        List<String> stringArrayList = new ArrayList<>();
        Arrays.stream(strings)
                .filter(s -> s.length() > 18)
                .forEach(s -> {
                    if (!stringArrayList.contains(s))
                        stringArrayList.add(s);
                });
        System.out.println(stringArrayList);
    }

    public static void main(String[] args) {
        String magnumOpus = """
                Вiчний революцйонер –
                Дух, що тiло рве до бою,
                Рве за поступ, щастя й волю,
                Вiн живе, вiн ще не вмер.
                Нi попiвськiї тортури,
                Нi тюремнi царськi мури,
                Анi вiйська муштрованi,
                Ні гармати лаштованi,
                Нi шпiонське ремесло
                В грiб його ще не звело.
                
                Вiчний революцйонер –               
                Вiн не вмер, вiн ще живе!
                Хоч вiд тисяч лiт родився,
                Та аж вчора розповився
                I о власнiй силi йде.
                I простується, мiцнiє,
                I спiшить туди, де днiє;
                Словом сильним, мов трубою
                Мiлiони зве з собою,-
                Мiлiони радо йдуть,
                Бо се голос духа чуть
                """;
        task2(magnumOpus);
    }
}
