package Person;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("tuan", "xuan hoa");
        System.out.println(person.toString());

        Person student = new Student("lap trinh", 1995, 2.3);
//        student.setName("tran anh");
        System.out.println(student.getName());
        System.out.println(student.toString());
//        System.out.println(person.toString());
    }
}
