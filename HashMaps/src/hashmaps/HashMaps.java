/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaps;
import hashmaps.linkedList.*;
import java.util.Arrays;
/**
 *
 * @author ASC Student
 */

public class HashMaps<E> {

    /**
     * @param args the command line arguments
     */
    MyLinkedList<Integer>[] storage = new MyLinkedList[8];
    MyLinkedList<String>[] keys = new MyLinkedList[8];
    int elementCount = 0;
    
    public void put(String key, E element){
        int hash = hash(key);
        if(keys[hash] == null){
            keys[hash] = new MyLinkedList<String>();
            storage[hash] = new MyLinkedList<Integer>();
        }else{
            keys[hash].add(key);
            storage[hash].add((Integer) element);
    }
        
        elementCount++;
        if(elementCount > Math.sqrt(keys.length)){
            resize();
        }
    }
    
    public Integer get(String key) {
		int index = hash(key);
		return storage[index].get(keys[index].indexOf(key));
	}
    
    private int hash(String key){
        int x = 0;
        for(int i = 0; i < key.length() - 1; i++){
            x = key.charAt(i);
            x = x * key.charAt(i + 1);;
        }
        return Math.abs(x % storage.length);
    }
    
    @SuppressWarnings("unchecked")
	private void resize() {
		//Resizing should be the square of the previous array length
		elementCount = 0;
		MyLinkedList<Integer>[] tempStorage = Arrays.copyOf(storage, storage.length);
		MyLinkedList<String>[] tempKeys = Arrays.copyOf(keys, keys.length);
		
		storage = new MyLinkedList[storage.length * storage.length];
		keys = new MyLinkedList[keys.length * keys.length];

		for(int x = 0; x < tempKeys.length; x++) {
			
			if(tempKeys[x] != null) {
				for(int y = 0; y < tempKeys[x].size(); y++) {
				put(tempKeys[x].get(y),(E) tempStorage[x].get(y));
				}
			}
		}
	}
    
}
