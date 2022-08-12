public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
        }

    @Override
    public String toString() {
        return "Слов в составе Фамилии: " + (surname != null ? surname.split(" ").length + "" : "0")
                + " Возраст: " + age + " ФИО: " + name + " " + surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

}
