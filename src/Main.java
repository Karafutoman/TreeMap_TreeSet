import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Petya", "Ivanov Pervyi", 20));
        people.add(new Person("Olya", "Chepirovaya", 17));
        people.add(new Person("Anna", "Sidorova", 32));
        people.add(new Person("Tolya", "Zabarchuk", 41));
        people.add(new Person("Svetlana", "Li Bo Hu", 13));

        people.sort((p1, p2) -> {
            if ((p2.getSurname().split(" ").length > 2) & (p1.getSurname().split(" ").length > 2)) {
                return p2.getAge() - p1.getAge();
            } else {
                return p2.getSurname().split(" ").length - p1.getSurname().split(" ").length;
            }
        });
        //System.out.println(people);
        for (Person person : people) {
            System.out.println(person);

        }
    }
}
