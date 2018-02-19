package HT4;

/*
- * Universidad del VAlle de Guatemala	
- * Guatemala 14 de febrero 2018	
- * Algoritmos y Estructura de Datos	
- * Hoja de Trabajo 4	
- * El objetivo de esta Hoja de Trabajo es realizar una calculadora para evaluar	
- * expresiones postfix.	
- * @author Antonio #17273	
- * @author Andres Perez #	
 */

/**
 *
 * @author Antonio Reyes, Hector Miguel Valle, Rodrigo Samayoa
 */
public class Calculadora implements CalculadoraI {
    /**
     * metodo calcular. se utiliza para poder realizar operaciones escritas en postfix
     * @param esp
     * @return Valor de la operacion realizada
     */
    public String calcular(String esp){
        String respuesta = "";
        StackVector<String> pila = new StackVector<String>();
        StackVector<Integer> evaluador = new StackVector<Integer>();
        Boolean error = false;
        
        String[] cadena = esp.split(" ");
        String caracter;
        
        Factory fact = new Factory();
        int res;
        
        // Metemos al stack los elementos en orden inverso.
        for(int i= cadena.length - 1; i >= 0; i--){
            caracter = cadena[i];
            pila.push(caracter);
        }
        
        fact.calcFactory(pila, evaluador, error);
        
        
        if (!error) {
            //en caso de que error = false
            return String.valueOf( evaluador.pop() );
        } else {
            //en caso de que error = true (hay una division con 0 como el denominador).
            return "Error";
        }
    }
}