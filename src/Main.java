/* Tarea 3 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2: \n");
        ejercicio2();

        System.out.println("Ejercicio 3: \n");
        ejercicio3();
    }

    /* Realiza la ejecucion del ejercicio 2 de forma iterativa y recursiva. */
    private static void ejercicio2() {
        int[] arregloX = {};
        System.out.println("Original:");
        System.out.println(imprimirArreglo(arregloX) + "\n");
        Ejercicio2 ejercicio2 = new Ejercicio2();
        System.out.println("Iterativo:");
        System.out.println(ejercicio2.frecuenciaIterativo(arregloX) + "\n");
        System.out.println("Recursivo:");
        System.out.println(ejercicio2.frecuenciaRecursivo(arregloX) + "\n");
    }

    /* Realiza la ejecucion del ejercicio 3 de forma iterativa y recursiva. */
    private static void ejercicio3() {
        int n = 11;
        System.out.println("Sumar " +n+ " numeros impares \n");
        Ejercicio3 ejercicio3 = new Ejercicio3();
        System.out.println("Iterativo: " + ejercicio3.sumImparesIterativo(n) + "\n");
        System.out.println("Recursivo: " + ejercicio3.sumImparesRecursivo(n) + "\n");


    }

    /* Regresa la representacion en cadena de un arreglo. */
    private static String imprimirArreglo(int[] matriz) {
        int tamanio = matriz.length;
        String cadena = "[";
        for (int i = 0; i < tamanio; i++) {
            if (i == tamanio - 1) {
                cadena += matriz[i];
            } else {
                cadena += matriz[i] + ", ";
            }
        }
        cadena += "]";
        return cadena;
    }
}