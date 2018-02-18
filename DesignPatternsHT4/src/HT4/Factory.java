
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
public class Factory {
    
     void calcFactory(StackVector<String> pila, StackVector<Integer> evaluador, Boolean error){
         
         Operaciones oper = null;
         
        
        String caracter;
        while(!pila.empty()){
        if ("0123456789".contains(pila.peek())) {
                // Si el peek() es un numero
                evaluador.push(Integer.parseInt(pila.pop()));
            } else {
                // Si no es un numero
                caracter = pila.pop();
                switch (caracter.charAt(0)) {
                    case '+': {
                        // Suma.
                        oper = new Operaciones();
                        evaluador.push(oper.Suma(evaluador.pop(), evaluador.pop()));
                        break;
                    }
                    case '-': {
                        // Resta.
                        oper = new Operaciones();
                        evaluador.push(oper.Resta(evaluador.pop(), evaluador.pop()));
                        break;
                    }
                    case '*': {
                        // Multiplicacion.
                        oper = new Operaciones();
                        evaluador.push(oper.Multiplicacion(evaluador.pop(), evaluador.pop()));
                        break;
                    }
                    case '/': {
                        // Division.
                        int numerador = evaluador.pop();
                        int denominador = evaluador.pop();
                        // Evaluamos si no hay un error.
                        if (denominador != 0) {
                            // No hay error.
                            oper = new Operaciones();
                            evaluador.push(oper.Division(evaluador.pop(), evaluador.pop()));
                        } else {
                            // Hay error, si el 0 esta en el denominador, no hay solucion
                            error = true;
                            evaluador.push(0);
                        }
                        break;
                    }
                }
            }
        }
        
    }
}
