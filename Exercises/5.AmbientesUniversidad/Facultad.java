import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Facultad{
    private ArrayList<Piso> pisos;
    private int limitePisos;
    
    public Facultad(int cantidadPisos){
        pisos = new ArrayList<>();
        limitePisos = cantidadPisos;
    }
    
    public int verificarAmbienteDadoUnNumero(int capacidad, int ubicacion){
        Piso actualPiso = null;
        for(int i = 0;  i < pisos.size() - 1; i++){
            if(pisos.get(i).obtenerPiso() == ubicacion){
                actualPiso = pisos.get(i);
            }
            else return 0;
        }
        return cantidadAmbientes(actualPiso.obtenerAmbientes(), capacidad);
    }
    
    private int cantidadAmbientes(ArrayList<Ambiente> ambientes, int capacidad){
        int total = 0;
        for(int i = 0;  i < ambientes.size() - 1; i++){
            if(ambientes.get(i).obtenerCapacidad() >= capacidad){
                total++;
            }
        }
        return total;
    }
    
    public int obtenerTotalAmbientesDeUnPiso(int ubicacion){
        int totalAmbientes = 0;
        for(int i = 0;  i < pisos.size() - 1; i++){
            if(pisos.get(i).obtenerPiso() == ubicacion){
                totalAmbientes = pisos.get(i).obtenerAmbientes().size();
            }
            else return 0;
        }
        return totalAmbientes;
    }
    
    public ArrayList<Ambiente> obtenerTotalAmbientes(){
        ArrayList<Ambiente> ambientes = new ArrayList<>();
        for(int i = 0;  i < pisos.size() - 1; i++){
            ArrayList<Ambiente> nuevosAmbientes = pisos.get(i).obtenerAmbientes();
            for(int j = 0; j < nuevosAmbientes.size() - 1; j++){
                ambientes.add(nuevosAmbientes.get(j));
            }
        }
        return ambientes;
    }
    
    public ArrayList<Ambiente> obtenerAmbientesMenores(int tamanio){
        ArrayList<Ambiente> ambientes = obtenerTotalAmbientes();
        ArrayList<Ambiente> ambientesMenores = new ArrayList<>();
        for(int i = 0; i < ambientes.size(); i++){
            if(ambientes.get(i).obtenerCapacidad() < tamanio){
                ambientesMenores.add(ambientes.get(i));
            }
        }
        return ambientesMenores;
    }
    
    public boolean verificarSiSePuedeAumentarAmbiente(){
        int ambientesDisponibles = limitePisos * 5;
        int totalAmbientes = obtenerTotalAmbientes().size();
        return totalAmbientes < ambientesDisponibles;
    }
    
    public Map realizarReporteDeCapacidad(){
        Map<Integer, Integer> capacidades = new HashMap<>();
        int sumaTotal = 0;
        for(int i = 0; i < pisos.size(); i++){
            int piso = pisos.get(i).obtenerPiso();
            sumaTotal += pisos.get(i).sumarCapacidades();
            capacidades.put(piso, sumaTotal);
        }
        return capacidades;
    }
}
