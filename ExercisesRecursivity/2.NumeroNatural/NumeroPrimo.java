/**
 * Esta clase NumeroPrimo nos permite saber si un numero es primo o no.
 *
 * @author CDCC
 * @version 1.0
 */
public class NumeroPrimo{
    public boolean esPrimo(int n){
        return esPrimo(n, 0, n);
    }
    
    private boolean esPrimo(int n, int contador, int divisor){
        boolean res = false;
        if(divisor == 1){
            if(contador == 1){
                res = true;
            }
        }
        else{
            if(n % divisor == 0){
                contador++;
            }
            res = esPrimo(n, contador, divisor-1);
        }
        return res;
    }
}
