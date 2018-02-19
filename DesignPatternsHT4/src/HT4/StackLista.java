/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT4;

 
/**
 *
 * @author Antonio
 * @author Andres Perez
 */
public class StackLista{
    
    protected SinglyLinkedList lista1;
    
    public StackLista(){
        StackLista lista = new StackLista();
    }
    
    public void push(String item){
        lista1.addLast(item);
    }
    
    public void pop(String item){
        lista1.removeLast();
    }
    
    
    
}

