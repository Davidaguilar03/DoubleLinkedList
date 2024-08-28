import co.edu.uptc.models.DoubleLinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        int arrayAux[] = new int[10_000_000];
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        long tiempoInicio = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            arrayAux[i]=i;
            doubleLinkedList.add(i);
        }
        long tiempoFin = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFin - tiempoInicio;
        System.out.println("El tiempo de ejecución es: " + tiempoEjecucion + " milisegundos.");
    }
}
