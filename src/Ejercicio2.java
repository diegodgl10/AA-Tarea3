import java.util.List;
import java.util.ArrayList;;

/**
 * Dado un arreglo finito X de n enteros, no necesariamente distintos,
 * determinar la frecuencia de los elementos en X.
 * @author Zamora Cruz Diego Arturo.
 */
public class Ejercicio2 {

    /**
     * Constructor vacio.
     */
    public Ejercicio2() {

    }

    /**
     * Calcula la frecuencia de cada numero de un arreglo X, de forma iterativa.
     * @param arregloX arreglo que contiene enteros.
     * @return una lista de duplas con la frecuencia de cada numero.
     */
    public List<Dupla<Integer>> frecuenciaIterativo(int[] arregloX) {
        List<Integer> elementos = new ArrayList<Integer>();
        List<Integer> repeticiones = new ArrayList<Integer>();
        for (int i = 0; i < arregloX.length; i = i+1) {
            int elemento = arregloX[i];
            if (elementos.contains(elemento)) {
                int posicion = elementos.indexOf(elemento);
                int contador = repeticiones.get(posicion);
                repeticiones.set(posicion, contador + 1);
            } else {
                elementos.add(elemento);
                repeticiones.add(1);
            }
        }
        List<Dupla<Integer>> frecuencias = new ArrayList<Dupla<Integer>>();
        for (int k = 0; k < elementos.size(); k++) {
            Dupla<Integer> dupla = new Dupla<Integer>(elementos.get(k), repeticiones.get(k));
            frecuencias.add(dupla);
        }
        return frecuencias;
    }

    /**
     * Calcula la frecuencia de cada numero de un arreglo X, de forma recursiva.
     * @param arregloX arreglo que contiene enteros.
     * @return una lista de duplas con la frecuencia de cada numero.
     */
    public List<Dupla<Integer>> frecuenciaRecursivo(int[] arregloX) {
        List<Integer> elementos = new ArrayList<Integer>();
        List<Integer> repeticiones = new ArrayList<Integer>();
        return auxFrecuenciaRecursiva(arregloX, 0, elementos, repeticiones);
    }

    /* Calcula la frecuencia de cada numero de un arreglo X. */
    private List<Dupla<Integer>> auxFrecuenciaRecursiva(int[] arregloX, int contador,
    List<Integer> elementos, List<Integer> repeticiones) {
        if (contador == arregloX.length) {
            List<Dupla<Integer>> frecuencias = new ArrayList<Dupla<Integer>>();
            return generarFrecuencias(elementos, repeticiones, frecuencias);
        } else {
            int elemento =arregloX[contador];
            if (elementos.contains(elemento)) {
                int posicion = elementos.indexOf(elemento);
                int repetido = repeticiones.get(posicion);
                repeticiones.set(posicion, repetido + 1);
            }else {
                elementos.add(elemento);
                repeticiones.add(1);
            }
            contador = contador + 1;
            return auxFrecuenciaRecursiva(arregloX, contador, elementos, repeticiones);
        }
    }

    /* Genera la lista de tuplas de frecuencias de aparicion de cada numero. */
    private List<Dupla<Integer>> generarFrecuencias(List<Integer> elementos,
    List<Integer> repeticiones, List<Dupla<Integer>> frecuencias) {
        if (elementos.size() == 0) {
            return frecuencias;
        } else {
            int elemento = elementos.get(0);
            int repetido = repeticiones.get(0);
            Dupla<Integer> dupla;
            dupla = new Dupla<Integer>(elemento, repetido);
            frecuencias.add(dupla);
            elementos.remove(0);
            repeticiones.remove(0);
            return generarFrecuencias(elementos, repeticiones, frecuencias);
        }
    }

}