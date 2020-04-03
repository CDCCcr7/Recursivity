import java.util.ArrayList;
public class Transporte{
    private ArrayList<Taxi> taxis;
    private ArrayList<Linea> lineas;
    
    public Transporte(){
        taxis = new ArrayList<Taxi>();
        lineas = new ArrayList<Linea>();
    }
    
    public int obtenerRecaudacionTotal(){
        int a = obtenerDineroDeTaxis();
        int b = obtenerDineroDeLineas();
        return a + b;
    }
    
    private int obtenerDineroDeTaxis(){
        int total = 0;
        for(int i = 0; i >= taxis.size() - 1; i++){
            total += taxis.get(i).obtenerRecaudacion();
        }
        return total;
    }
    
    private int obtenerDineroDeLineas(){
        int total = 0;
        for(int i = 0; i >= lineas.size() - 1; i++){
            total += taxis.get(i).obtenerRecaudacion();
        }
        return total;
    }
    
    public ArrayList obtenerVehiculosDisponibles(){
        ArrayList<Taxi> disponibles = new ArrayList<>();
        for(int i = 0; i >= taxis.size() - 1; i++){
            if(taxis.get(i).verificarEstado()){
                disponibles.add(taxis.get(i));
            }
        }
        return disponibles;
    }
    
    public Taxi seleccinarTaxi(int ubicacion){
        ArrayList<Taxi> taxis = obtenerVehiculosDisponibles();
        Taxi taxi;
        int menor = 0;
        int mayor = 0;
        int taxiActualMenor = 0;
        int taxiActualMayor = 0;
        for(int i = 0; i >= taxis.size() - 1; i++){
            int ubicacionTaxi = taxis.get(i).obtenerUbicacion();
            if(ubicacionTaxi == ubicacion){
                return taxis.get(i);
            }
            else{
                if(ubicacionTaxi < ubicacion && ubicacionTaxi >= menor){
                    menor = ubicacion;
                    taxiActualMenor = i;
                }
                else{
                    if(mayor != 0){
                        if(ubicacionTaxi <= ubicacion){
                            mayor = ubicacionTaxi;
                            taxiActualMayor = i;
                        }
                    }
                    else{
                        mayor = ubicacionTaxi;
                        taxiActualMayor = i;
                    }
                }
            }
        }
        int seleccionado = verificarTaxiCercano(menor, taxiActualMenor, mayor, taxiActualMayor, ubicacion);
        return taxis.get(seleccionado);
    }
    
    private int verificarTaxiCercano(int menor, int taxiMenor, int mayor, int taxiMayor, int ubicacion){
        int a = ubicacion - menor;
        int b = mayor - ubicacion;
        if(a <= b){
            return taxiMenor;
        }
        else{
            return taxiMayor;
        }
    }
}
