public class Person {
    private String name;
    private String surname;
    private String city;
    private String phone;

    public Person(String name, String surname, String city, String phone) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phone = phone;
    }

    public String personInfo() {
        return "Зателефонувати громадянину " + name + " " + surname + " з міста " + city + " можна за номером " + phone;
    }
    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person person2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());
    }

}
