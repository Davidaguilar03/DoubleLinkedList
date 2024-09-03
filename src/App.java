import co.edu.uptc.models.DoubleLinkedList;
import co.edu.uptc.models.MySort;
import co.edu.uptc.models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList<Person> personList = new DoubleLinkedList<Person>();
        personList.add(new Person("David", "Aguilar", 45));
        personList.add(new Person("Santiago", "Sierra",22));
        personList.add(new Person("Oscar", "Guitierrez", 30));
        MySort.sortByAge(personList);
        for (Person person : personList) {
            System.out.println(person);
        }
        
    }
}
