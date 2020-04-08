/**
 * Clase Serie que hereda de la clase Abstracta Recurso que nos permite
 * definir el nombre y la categoria.
 *
 * @author CDCC
 * @version 1.0
 */
public class Serie extends Recurso{
    public Serie(String nuevoNombre, String nuevaCategoria){
        nombre = nuevoNombre;
        categoria = nuevaCategoria;
    }
    
    public String categoria(){
        return categoria;
    }
}
