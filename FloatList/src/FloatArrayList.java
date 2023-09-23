/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class FloatArrayList implements FloatList {


    private final Float[] vector;
    private int pos;


    public FloatArrayList(int tam) {
        vector = new Float[tam];
        pos = 0;
    }

    private void limits(int index) {
        if ((index < 1) || (index > vector.length))
            throw new RuntimeException("The index is out of limits.");
    }

    @Override
    public int size() {
        return pos;
    }

    @Override
    public boolean isEmpty() {
        return pos == 0;
    }

    @Override
    public void add(Float value) {
        if (size() == vector.length) {
            throw new RuntimeException("The list is full");
        }
        for (int i = pos - 1; i >= 0; i--) {
            vector[i + 1] = vector[i];
        }
        vector[0] = value;
        pos++;
    }

    @Override
    public void add(int index, Float value) {
        limits(index);
        // add in the index - 1 of the vector and move the elements to the right
        for (int i = pos - 1; i >= index - 1; i--) {
            vector[i + 1] = vector[i];
        }
        vector[index - 1] = value;
        pos++;
    }

    @Override
    public Float remove() {
        if (isEmpty()) {
            throw new RuntimeException("The list is empty");
        }
        Float value = get();
        for (int i = 0; i < pos - 1; i++) {
            vector[i] = vector[i + 1];
        }
        pos--;
        return value;
    }


    @Override
    public Float remove(int index) {
        if (isEmpty()) {
            throw new RuntimeException("The list is empty");
        }
        Float value = get(index);
        for (int i = index; i < pos - 1; i++) {
            vector[i] = vector[i + 1];
        }
        pos--;
        return value;    }

    @Override
    public Float get() {
        return vector[0];
    }

    @Override
    public Float get(int index) {
        return vector[index-1];
    }

    @Override
    public int search(Float value) {
        for (int i = 0; i < pos; i++) {
            if (vector[i].equals(value)) {
                return i+1;
            }
        }
        return 0;
    }


        @Override
        public boolean contains (Float value){
            return search(value) != 0;
        }
}
