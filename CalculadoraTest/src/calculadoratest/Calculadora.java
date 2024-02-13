package calculadoratest;

/**
 * Clase que tiene metodos matematicos.
 * @author lv1821
 */
public class Calculadora {
    
   
    public int sumar(int x, int y){
        return x + y;
    }
    
    /**
     * metodo que resta sus parametros.
     * @param x primer parametro para la resta.
     * @param y segundo parametro para la resta.
     * @return la resta de los valores X y Y.
     */
    public int restar(int x, int y){
        return x - y;
    }
    
    /**
     * metodo que multiplica sus parametros.
     * @param x primer parametro para la multiplicacion.
     * @param y segundo parametro para la multiplicacion.
     * @return la multiplicacion de los valores X y Y.
     */
    public int producto(int x, int y){
        return x * y;
    }
}
