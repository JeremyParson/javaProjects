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
public class MyLinkedList<E> {
    Node<E> head = new Node(null);
    
    public void add(E element){
        Node<E> temp = head;
        for(int x = 0; x < size(); x++){
            temp = temp.getNext();
        }
        temp.setNext(new Node(element));
    }
    
    public E get(int input) {
		Node temp = head;
		for (int x = 0; x <= input; x++) {
			if (temp.hasNext()) {
				temp = temp.getNext();
			}
		}

		return (E) temp.getStorage();
	}
    
    public void remove(int index){
        Node<E> temp = head;
        for(int x = 0; x < index; x++){
            temp = temp.getNext();
        }
        if(temp.getNext().hasNext() == true){
            temp.setNext(temp.getNext().getNext());
        }else{
            temp.setNext(null);
        }
    }
    
    public int indexOf(E element){
        int index = 0;
        Node<E> temp = head;
        for(int x = 0; x < size(); x++){
            if(temp.getStorage() == element){
                break;
            }
            index = x;
        }
        return index;
    }
    
    public E getIndex(int index){
        Node temp = head;
        for(int x = 0; x <= index;x++){
            temp = temp.getNext();
        }
        return (E) temp.getStorage();
    }
    
    public void setIndex(E element, int index){
        Node temp = head;
        for(int x = 0; x <= index;x++){
            temp = temp.getNext();
        }
        temp.setStorage(element);
    }
    
    public int size() {
		Node temp = head;
		int size = 0;
		while (temp.hasNext()) {
			if (temp.hasNext()) {
				temp = temp.getNext();
				size++;
			} else {
				break;
			}
		}
		return size;
	}
    
    public boolean contains(E element){
        boolean contains = false;
        Node<E> temp = head;
        for(int x = 0; x < size(); x++){
            temp = temp.getNext();
            if(temp.getStorage() == element){
                contains = true;
            }
        }
        return contains;
    }
    
    public int firstInstanceOf(E element){
        return 0;
    }
    
    
}
