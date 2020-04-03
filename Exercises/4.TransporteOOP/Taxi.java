public class Taxi{
    private String nombre;
    private int ubicacion;
    private int costoPasaje;
    private int costoAdicional;
    private boolean estado;
    private int recaudacionTotal;
    
    public Taxi(String nuevoNombre, int nuevaUbicacion, int nuevoCostoPasaje, int nuevoCostoAdicional){
        nombre = nuevoNombre;
        ubicacion = nuevaUbicacion;
        costoPasaje = nuevoCostoPasaje;
        costoAdicional = nuevoCostoAdicional;
        recaudacionTotal = 0;
    }
    
    public int obtenerRecaudacion(){
        return recaudacionTotal;
    }
    
    public boolean verificarEstado(){
        return estado;
    }
    
    public void volverOcupado(){
        estado = true;
    }
    
    public void volverLibre(){
        estado = false;
    }
    
    public int obtenerUbicacion(){
        return ubicacion;
    }
    
    public void cobrar(int dineroCobrado){
        recaudacionTotal += dineroCobrado;
    }
}
