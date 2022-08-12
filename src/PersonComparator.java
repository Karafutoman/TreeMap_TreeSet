import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    private final int Words;

    public PersonComparator(int Words) {
        this.Words = Words;
    }

    @Override
    public int compare(Person o1, Person o2) {

        int surname1 = o1.getSurname() != null ? o1.getSurname().split(" ").length : 0;
        int surname2 = o2.getSurname() != null ? o2.getSurname().split(" ").length : 0;
        int age1 = o1.getAge();
        int age2 = o2.getAge();

        if (surname1 >= Words && surname2 >= Words) {
            return Integer.compare(age1, age2);
        }

        if (surname1 > surname2) {
            return 1;
        } else if (surname1 < surname2) {
            return -1;
        } else {
            return Integer.compare(age1, age2);
        }
    }
}