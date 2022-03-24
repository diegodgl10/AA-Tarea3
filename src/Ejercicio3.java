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
        int suma = 0;
        for (int s = 1; s <= n; s++) {
            suma = suma + ((s*2) - 1);
        }
        return suma;
    }

    /**
     * Realiza la suma de los primeros n numeros impares de forma recursiva.
     * @param n la cantidad de los primeros numeros impares que se sumara.
     * @return la suma de los primeros n numeros impares.
     */
    public int sumImparesRecursivo(int n) {
        if (n == 1) {
            return 1;
        } else {
            return ((2*n) - 1) + sumImparesRecursivo(n - 1);
        }
        //return auxSumRecursiva(n, 0, 1);
    }
}