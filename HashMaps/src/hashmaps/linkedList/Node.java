/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaps.linkedList;

/**
 *
 * @author ASC Student
 */
public class Node<E> {
    Node<E> nextNode;
    E Storage;
    
    public Node(E element){
        Storage = element;
    }
    
    public E getStorage(){
        return Storage;
    }
    
    public void setStorage(E element){
        Storage = element;
    }
    
    public boolean hasNext(){
        if(nextNode != null){
        return true;
        }else{
            return false;
        }
    }
    
    public Node getNext(){
        return nextNode;
    }
    
    public void setNext(Node nextNode){
        this.nextNode = nextNode;
    }
}
