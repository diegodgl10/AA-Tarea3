/**
 * Realiza la busqueda de la posicion de un elmento x en un arreglo A,
 * entre los indices a y b, con a <= b.
 * @author Zamora Cruz Diego Arturo
 */
public class Ejercicio4 {

    /**
     * Constructor vacio.
     */
    public Ejercicio4() {

    }

    /**
     * Realiza la busqueda de la posicion de un elmento x en un arreglo A,
     * entre los indices a y b, cin a <= b.
     * @param arregloA arreglo donde se hara la busqueda.
     * @param a el indice 'a' tal que 'a' <= 'b'.
     * @param b el indice 'b' tal que 'b' >= 'a'.
     * @param x el elmento que se buscara.
     * @return el indice de la posicion de un elmento x en un arreglo A,
     * entre los indices a y b, con a <= b.
     */
    public int metodoV(int[] arregloA, int a, int b, int x) {
        int i;
        i = a;
        while (x != arregloA[i]) {
            i = i + 1;
        }
        return i;
    }
}