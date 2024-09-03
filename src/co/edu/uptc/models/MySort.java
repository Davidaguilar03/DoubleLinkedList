package co.edu.uptc.models;

public class MySort {
    public static <T extends Comparable<T>> void sortByAge(DoubleLinkedList<T> list) {
        int n = list.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list.get(i-1).compareTo(list.get(i)) > 0) {
                    T temp = list.get(i-1);
                    list.set(i-1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
    public static <T extends Person> void sortByLastName(DoubleLinkedList<T> list) {
        int n = list.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list.get(i-1).compareByLastName(list.get(i)) > 0) {
                    T temp = list.get(i-1);
                    list.set(i-1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
    public static <T extends Person> void sortByName(DoubleLinkedList<T> list) {
        int n = list.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (list.get(i-1).compareByName(list.get(i)) > 0) {
                    T temp = list.get(i-1);
                    list.set(i-1, list.get(i));
                    list.set(i, temp);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}