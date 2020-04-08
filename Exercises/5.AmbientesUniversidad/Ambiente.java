public class Ambiente{
    private int capacidad;
    private String nombreAmbiente;
    
    public Ambiente(int nuevaCapacidad, String nuevoNombre){
        capacidad = nuevaCapacidad;
        nombreAmbiente = nuevoNombre;
    }
    
    public int obtenerCapacidad(){
        return capacidad;
    }
    
    public String obtenerNombre(){
        return nombreAmbiente;
    }
}
