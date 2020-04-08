import java.util.ArrayList;
/**
 * Clase App es la que controla todas las series que puede ver un usuario
 * ademas de poder recomendar una serie dependiendo del historial de un 
 * usuario.
 *
 * @author CDCC
 * @version 1.0
 */
public class App{
    private ArrayList<Serie> series;
    
    public App(){
        series = new ArrayList<>();
    }
    
    public ArrayList<Serie> recomendarSerie(Usuario usuario){
        ArrayList<Serie> vistos = usuario.obtenerHistorial();
        String categoria = vistos.get(vistos.size() - 1).categoria();
        return buscarSeriesRelacionadas(categoria);
    }
    
    private ArrayList<Serie> buscarSeriesRelacionadas(String categoria){
        ArrayList<Serie> res = new ArrayList<>();
        for(int i = 0; i < series.size(); i++){
            if(series.get(i).categoria() == categoria){
                res.add(series.get(i));
            }
        }
        return res;
    }
}
