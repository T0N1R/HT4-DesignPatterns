
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
    
    
    StackFactory pila = new StackFactory();
    FactoryLista listas = new FactoryLista();
    
    public void opcionRealizada(String opcion1, String opcion2){
        switch(opcion1){
            case "1":{
                //Crea un ArrayList
                pila.getStack("AL");
                break;
            }
            
            case "2":{
                //Crea un StackVector
                pila.getStack(" ");
                break;
            }
            
            case "3":{
                switch(opcion2){
                    case "1":{
                        //crea lista simplemente enlazada
                        listas.getList("1");
                        break;
                    }
                    
                    case "2":{
                        //crea lista doblemente enlazada
                        listas.getList("2");
                        break;
                    }
                    
                    case "3":{
                        //crea lista circular
                        listas.getList("3");
                        break;
                    }
                }
                
                break;
            }
        }
    }
}
