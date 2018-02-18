
package HT4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Universidad del VAlle de Guatemala	
* Guatemala 14 de febrero 2018	
* Algoritmos y Estructura de Datos	
* Hoja de Trabajo 4	
* El objetivo de esta Hoja de Trabajo es realizar una calculadora para evaluar	
* expresiones postfix.	
* @author Antonio #17273	
* @author Andres Perez #
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Calculadora main = new Calculadora();
        File opera = new File("C:\\Users\\Andres\\Documents\\GitHub\\HT4-DesignPatterns\\DesignPatternsHT4\\src\\HT4\\prueba.txt");
        FileReader leer = new FileReader(opera);
        BufferedReader buff = new BufferedReader(leer);
        
        String linea;
        while((linea = buff.readLine()) != null){
          System.out.println(linea);
          System.out.println("Respuesta: " + main.calcular(linea) + "\n");
        }

        
        
        
    }
    
}

