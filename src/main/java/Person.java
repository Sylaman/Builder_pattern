import java.util.Objects;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        return !(age == 0);
    }

    public boolean hasAddress() {
        return city == null;
    }

    public void happyBirthday(int age) {
        if (hasAge())
            this.age += age;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder newChildBuilder = new PersonBuilder();
        newChildBuilder.surname(surname);
        newChildBuilder.age(0);
        return newChildBuilder;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        this.city = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Person [name: " + name
                + ", surname: " + surname
                + ", age: " + age
                + ", city: " + city + "]";
    }
}
