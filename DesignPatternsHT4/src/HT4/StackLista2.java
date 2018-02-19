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
public class StackLista2 {
    protected DoublyLinkedList lista2;
    
    public StackLista2(){
        StackLista2 lista = new StackLista2();
    }
    
    public void push (String item){
        lista2.addLast(item);
    }
    
    public void pop (String item){
        lista2.removeLast();
    }
}
