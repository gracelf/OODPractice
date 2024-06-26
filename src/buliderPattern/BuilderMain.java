package buliderPattern;

/**
 *
 */
public class BuilderMain {

    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Ryan", "pwd") //constructor for required fields
                .setEmail("Dr.ryan@gmail.com")
                .setPhone("123-456-7890")
                .build();

        System.out.println(student.toString());

    }

}
