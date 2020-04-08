import java.util.ArrayList;
public class Piso{
    private ArrayList<Ambiente> ambientes;
    private int ubicacionVertical;
    private int limiteAmbientes;
    
    public Piso(int nuevaUbicacion){
        ambientes = new ArrayList<Ambiente>();
        ubicacionVertical = nuevaUbicacion;
        limiteAmbientes = 50;
    }
    
    public int obtenerPiso(){
        return ubicacionVertical;
    }
    
    public ArrayList<Ambiente> obtenerAmbientes(){
        return ambientes;
    }
    
    public void agregarAmbiente(Ambiente nuevoAmbiente){
        ambientes.add(nuevoAmbiente);
    }
    
    public int sumarCapacidades(){
        int sumaTotal = 0;
        for(int i = 0; i < ambientes.size(); i++){
            sumaTotal += ambientes.get(i).obtenerCapacidad();
        }
        return sumaTotal;
    }
}
