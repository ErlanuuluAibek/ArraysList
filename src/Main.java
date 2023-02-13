import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Aibek",18);
        Student student2=new Student("Malika",16);
        Student student3=new Student("Uson",24);
        try {
            ArrayList<Student> students = new ArrayList<>();
            students.add(student);
            students.add(student2);
            students.add(student3);
        }catch (NullPointerException n){
            System.out.println("student null");

        }catch (IndexOutOfBoundsException o){
            System.out.println(o.getMessage());
        }
        finally {
            System.out.println("бутту");
        }
    }
}