import co.edu.uptc.models.DoubleLinkedList;
import co.edu.uptc.models.MySort;
import co.edu.uptc.models.Person;

public class App {
    public static void main(String[] args) {
        DoubleLinkedList<Person> personList = new DoubleLinkedList<>();
        personList.add(new Person("David", "Aguilar", 45));
        personList.add(new Person("Santiago", "Sierra", 22));
        personList.add(new Person("Oscar", "Guitierrez", 30));
        personList.add(new Person("Antonio", "Zantana", 70));
        
        MySort.sort(personList, MySort.byAge());
        System.out.println("Sorted by age:");
        for (Person person : personList) {
            System.out.println(person);
        }

        MySort.sort(personList, MySort.byName());
        System.out.println("\nSorted by name:");
        for (Person person : personList) {
            System.out.println(person);
        }

        MySort.sort(personList, MySort.byLastName());
        System.out.println("\nSorted by last name:");
        for (Person person : personList) {
            System.out.println(person);
        }
        
    }
}
