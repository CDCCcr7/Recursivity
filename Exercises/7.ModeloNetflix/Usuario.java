import java.util.ArrayList;
/**
 * Clase Usuario tiene un nombre y un codigo de usuario, donde podemos 
 * guardar la informacion de las series que ha visto. 
 *
 * @author CDCC
 * @version 1.0
 */
public class Usuario{
    private ArrayList<Serie> historial;
    
    public Usuario(){
        historial = new ArrayList<>();
    }
    
    public void verSerie(Serie serie){
        historial.add(serie);
    }
    
    public ArrayList<Serie> obtenerHistorial(){
        return historial;
    }
}
