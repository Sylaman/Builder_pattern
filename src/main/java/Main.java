public class Main {

    public static void main(String[] args) {

        // Демонстрация успешного создания объектов Person с помощью PersonBuilder и newChildBuilder
        Person father = new PersonBuilder()
                .name("Егор")
                .surname("Коршунов")
                .age(31)
                .city("Москва")
                .build();
        Person daughter = father.newChildBuilder()
                .name("Ксюша")
                .build();
        System.out.println("У " + father + " есть дочка, " + daughter);

        //демонстрация обработки ошибки из-за незаполненного обязательного поля surname
        try {
            Person person1 = new PersonBuilder()
                    .name("Анастасия")
                    .age(30)
                    .city("Москва")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        //демонстрация обработки ошибки из-за некорректного возраста
        try {
            Person person2 = new PersonBuilder()
                    .name("Анастасия")
                    .surname("Куницкая")
                    .age(-10)
                    .city("Москва")
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
