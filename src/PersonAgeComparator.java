import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person x1, Person x2) {
        return Integer.compare(x1.age, x2.age);
    }
}
