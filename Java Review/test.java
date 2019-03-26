
public class test<E>{
    private E storage;
    Node<E> nextNode;

    test(E storage){
        this.storage = storage;
    }

    public E getStorage(){
        return this.storage;
    }

    public void setStorage(E newStorage){
        storage = newStorage;
    }

    public void setNext(Node nextNode){
        this.nextNode = nextNode;
    }

    public Node getNext(){
        return this.nextNode;
    }
}