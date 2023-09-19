/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class FloatLinkedList implements FloatList {


    private class FloatNode {
        private Float elem;

        private FloatNode next;

        public FloatNode(Float elem, FloatNode next) {
            this.elem = elem;
            this.next = next;
        }

        public FloatNode getNext() {
            return next;
        }

        public Float getElem() {
            return elem;
        }

        public void setElem(Float elem) {
            this.elem = elem;
        }

        public void setNext(FloatNode next) {
            this.next = next;
        }
    }


    private FloatNode head;

    private int size;

    public FloatLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public void add(Float value) {
        this.head = new FloatNode(value, head);
        this.size++;
    }

    @Override
    public void add(int index, Float value) {
       FloatNode anterior = forward(index);
       if (anterior == null){
           add(value);
       }else {
           FloatNode node  = new FloatNode(value, anterior.getNext());
           this.size++;
           anterior.setNext(node);
       }
    }
    
    private FloatNode forward(int index){
        if(index < 1 || index > size +1){
            throw new RuntimeException("The index is out of bounds");
        }
        FloatNode ant = null;
        FloatNode act = this.head;
        for(int i = 1; i < index; i++){
            ant = act;
            act = act.getNext();
        }
        return ant;
    }

    @Override
    public Float remove() {
        if (this.isEmpty()){
            throw new RuntimeException("List is empty");
        }else{
            FloatNode node = this.head;
            this.size--;
            head = node.getNext();
            return node.getElem();
        }
        
        
    }

    @Override
    public Float remove(int index) {
        
        FloatNode ant = forward(index);
        if(ant == null){
            return remove();
        }else{
            this.size--;
            FloatNode removedNode = ant.getNext();
            ant.setNext(removedNode.getNext());
            return removedNode.getElem();
        }
        
    }

    @Override
    public Float get() {
        
        return head.elem;
        
    }

    @Override
    public Float get(int index) {
        
        FloatNode node = forward((index +1));
        return node.getElem();
        
    }

    @Override
    public int search(Float value) {
        if(isEmpty()){
            return 0;
        }
        FloatNode aux = head;
        int i = 1;
        while(i < size && (!aux.getElem().equals(value))){
            aux = aux.getNext();
            i++;
        }
        if(i < size || (aux.getElem().equals(value))){
            return  i;
        }
        return 0;
    }

    @Override
    public boolean contains(Float value) {
        return (search(value) != 0);
    }

}
