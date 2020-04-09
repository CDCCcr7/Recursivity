/**
 * Metodo que nos permite saber la cantidad de digitos que tiene un numero.
 *
 * @author CDCC
 * @version 1.0
 */
public class Contador{
    public int contarDigitos(int n){
        int res = 1;
        if(n == 0){
            return 0;
        }
        else{
            res += contarDigitos(n/10);
        }
        return res;
    }
}
