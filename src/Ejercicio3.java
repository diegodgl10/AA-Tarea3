/**
 * Considera el problema de calcular la suma de los primeros n n ́umeros impares positivo
 */
public class Ejercicio3 {

    /**
     * Constructor vacio.
     */
    public Ejercicio3() {

    }
    
    /**
     * Realiza la suma de los primeros n numeros impares de forma iterativa.
     * @param n la cantidad de los primeros numeros impares que se sumara.
     * @return la suma de los primeros n numeros impares.
     */
    public int sumImparesIterativo(int n) {
        int impar = 1;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma = suma + impar;
            impar = impar + 2;
        }
        return suma;
    }

    /**
     * Realiza la suma de los primeros n numeros impares de forma recursiva.
     * @param n la cantidad de los primeros numeros impares que se sumara.
     * @return la suma de los primeros n numeros impares.
     */
    public int sumImparesRecursivo(int n) {
        return auxSumRecursiva(n, 0, 1);
    }

    /* Suma de los primeros n numeros impares */
    private int auxSumRecursiva(int n, int suma, int impar) {
        if (n == 0) {
            return suma;
        } else {
            suma = suma + impar;
            impar = impar + 2;
            return auxSumRecursiva(n-1, suma, impar);
        }
    }
}