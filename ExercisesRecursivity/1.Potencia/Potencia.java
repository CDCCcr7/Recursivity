/**
 * Clase Potencia tiene un metodo que nos permite calcular
 * la potencia de un numero.
 *
 * @author CDCC
 * @version 1.0
 */
public class Potencia{
    public int sacarPotencia(int a, int b){
        return sacarPotencia(a, b, a, 2);
    }
    
    private int sacarPotencia(int a, int b, int res, int contador){
        if(contador == b){
            res *= a;
        }
        else{
            res *= a;
            res = sacarPotencia(a, b, res, contador + 1);
        }
        return res;
    }
}
