package calculadoratest;
import calculadoratest.Calculadora;
/**
 * Clase que tiene metodos para probar la clase Calculadora.
 * @author lv1821
 */
public class CalculadoraTest {
    
    /**
     * Este metodo de prueba, prueba el metodo suma() de la clase calculadora.
     */
    public void testSuma(){
        System.out.println("Prueba del metodo suma()");
        int x = 2;
        int y = 2;
        int resultadoEsperado = 4;
        
        Calculadora calculadora = new Calculadora();
        
        int resultado = calculadora.sumar(x, y);
        if(resultadoEsperado != resultado) throw new RuntimeException("Error: valor esperado " + resultadoEsperado + " ,valor obtenido " + resultado);
    }
    
    /**
     * Este metodo de prueba, prueba el metodo resta() de la clase calculadora.
     */
    public void testResta(){
        System.out.println("Prueba del metodo resta()");
        int x = 2;
        int y = 2;
        int resultadoEsperado = 0;
        
        Calculadora calculadora = new Calculadora();
        
        int resultado = calculadora.restar(x, y);
        if(resultado != resultadoEsperado) throw new RuntimeException("Error: valor esperado " + resultadoEsperado + " ,valor obtenido " + resultado);
    }
    
    public void testProducto(){
        System.out.println("Prueba del metodo producto()");
        int x = 5;
        int y = 5;
        int resultadoEsperado = 25;
        
        Calculadora calculadora = new Calculadora();
        
        int resultado = calculadora.producto(x, y);
        if(resultado != resultadoEsperado) throw new RuntimeException("Error: valor esperado " + resultadoEsperado + " ,valor obtenido " + resultado);
    }
}
