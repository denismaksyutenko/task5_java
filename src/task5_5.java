import java.util.ArrayList;
import java.util.List;

public class task5_5 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Denis", "maksuitenko", 20));
        personList.add(new Person("Maksim", "kysnichenko", 21));
        personList.add(new Person("Sasha", "sasageo", 29));
        personList.add(new Person("Marina", "serhienko", 30));
        personList.add(new Person("whoami+123456788", "secondwhoami", 40));
        System.out.println(personList + "\n");
        System.out.println(personList.stream().filter(person -> person.firstname.length() < 15).max(new PersonAgeComparator()));
    }
}
