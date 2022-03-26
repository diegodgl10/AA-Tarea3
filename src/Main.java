/* Tarea 3 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2: \n");
        ejercicio2();

        System.out.println("Ejercicio 3: \n");
        ejercicio3();

        System.out.println("Ejercicio 4: \n");
        ejercicio4();
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

    /* Realiza la ejecucion del ejercicio 4. */
    private static void ejercicio4() {
        int[] arregloA = {4,2,6,14,9,4,1,62,3,6,10};
        int a = 1;
        int b = 5;
        int x = 9;
        Ejercicio4 ejercicio4 = new Ejercicio4();
        System.out.println("Original:");
        System.out.println(imprimirArreglo(arregloA) + "\n");
        System.out.println("a :" +a+ "   b :" +b+ "   x :" +x);
        System.out.println("i :" + ejercicio4.metodoV(arregloA, a, b, x));
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