
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
public class FactoryLista {
    public List getList(String entry){
        /*if(entry.equals("1")){
            return new SinglyLinkedList();
        }
        
        if(entry.equals("2")){
            return new DoublyLinkedList();
        }
        
        if(entry.equals("3")){
            return new CircularList();
        }
        */
        List nuevo = null;
        switch(entry){
            case "1":{
                nuevo = new SinglyLinkedList();
            }
            
            case "2":{
                nuevo = new DoublyLinkedList();
            }
            
            case "3":{
                nuevo = new CircularList();
            }
        }
        
        return nuevo;
    }
}
