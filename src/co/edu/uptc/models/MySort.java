package co.edu.uptc.models;

import java.util.Comparator;

public class MySort {
    public static <T> void sort(DoubleLinkedList<T> list, Comparator<T> comparator) {
        int n = list.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (comparator.compare(list.get(i-1), list.get(i)) > 0) {
                    T temp = list.get(i-1);
                    list.set(i-1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
    
    public static Comparator<Person> byAge() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        };
    }

    public static Comparator<Person> byLastName() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        };
    }

    public static Comparator<Person> byName() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };
    }
}
