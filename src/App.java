import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.DoubleLinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        List<Integer> numbersList = new ArrayList<>(); 
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();
        for (int i = 0; i < 100; i++) {
            doubleLinkedList.add(i);
            numbersList.add(i);
        }
        long tiempoInicio = System.currentTimeMillis();
        for (int i = 0; i < doubleLinkedList.size()-1; i++) {
            sum = ((int)doubleLinkedList.get(i) + (int)doubleLinkedList.get(i+1));
        }
        // for (int i = 0; i < numbersList.size()-1; i++) {
        //     sum = numbersList.get(i) + numbersList.get(i+1);
        // }
        long tiempoFin = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFin - tiempoInicio;
        System.out.println("El tiempo de ejecución es: " + tiempoEjecucion + " milisegundos.");
    }
}
