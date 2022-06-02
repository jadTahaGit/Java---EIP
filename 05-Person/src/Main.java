public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Jad");
        person.setLastName("Taha");
        person.setAge(21);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("Adam");
        person.setAge(13);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen = " + person.isTeen());

    }
}
