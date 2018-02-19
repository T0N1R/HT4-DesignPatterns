
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
public class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Stack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
      return new StackArrayList<E>(); //regresa ArrayList
	else
      return new StackVector<E>(); //regresa Vector
   }
}
