/**
 * Clase Libro que hereda de la clase Abstracta Recurso que nos permite
 * definir el nombre y la categoria.
 *
 * @author CDCC
 * @version 1.0
 */
public class Libro extends Recurso{
    public Libro(String nuevoNombre, String nuevaCategoria){
        nombre = nuevoNombre;
        categoria = nuevaCategoria;
    }
}
