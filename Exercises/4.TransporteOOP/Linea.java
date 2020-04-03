public class Linea{
    private String nombreLinea;
    private String ruta;
    private int costoPasaje;
    private int recaudacionTotal;
    
    public Linea(String nuevoNombre, String nuevaRuta, int nuevoCostoPasaje){
        nombreLinea = nuevoNombre;
        ruta = nuevaRuta;
        costoPasaje = nuevoCostoPasaje;
        recaudacionTotal = 0;
    }
    
    public int obtenerRecaudacion(){
        return recaudacionTotal;
    }
}
