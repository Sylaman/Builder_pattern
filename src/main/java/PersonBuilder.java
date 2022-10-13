public class PersonBuilder {

    protected int age;
    protected String city;
    protected String name;
    protected String surname;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder age(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть меньше нуля!");
        }
        this.age = age;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age, city);
        if (name == null || surname == null) {
            throw new IllegalStateException("Не указаны данные об имени и/или фамилии!");
        }
        return person;
    }
}
