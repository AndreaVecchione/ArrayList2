import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Andrea", 22);
        Student student2 = new Student("Francesco", 18);
        Student student3 = new Student("Giuseppe", 20);
        Student student4 = new Student("Francesca", 23);
        Student student5 = new Student("Paola", 25);
        Student student6 = new Student("Alberto", 26);
        Student student7 = new Student("Marco", 17);
        Student student8 = new Student("Viola", 25);
        Student student9 = new Student("Pietro", 28);
        Student student10 = new Student("Riccardo", 23);
        Student student11 = new Student("Ilaria", 17);
        Student student12 = new Student("Gianpaolo", 27);
// creo un arraylist con i nomi degli studenti
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        list.add(student11);
        list.add(student12);
//lista stampata senza aveerla ordinata
        System.out.println("List is: " + list);
//vado a modificare l'ordine dei nomi sull'arraylist per alfabetico
        list.sort(Comparator.comparing(Student::getName));
        System.out.println("list in alphabetic order: " + list);




        }
    }
