/**
 *
 * @author mayte
 */
public interface FloatList {
    
    /**
     * Returns the number of elements in this list
     * 
     * @return the number of elements in this list
     */
    public int size();

    /**
     * Returns true if this list contains no elements
     *
     * @return true if this list contains no elements
     */
    public boolean isEmpty();

    /**
     * Appends the specified element to the beginning of this list
     *
     * @param value the element to be appended to this list
     */
    public void add(Float value);

    /**
     * Inserts the specified element at the specified position in this list (optional operation)
     *
     * @param index the index at which the specified element is to be inserted
     * @param value the element to be inserted
     */
    public void add(int index, Float value);

    /**
     * Returns and returns the element at the beginning of this list
     *
     * @return the element at the beginning of this list
     */
    public Float remove();

    /**
     * Removes and returns the element at the specified position in this list
     *
     * @param index the index of the element to be removed
     * @return  the element previously at the specified position
     */
    public Float remove(int index);

    /**
     * Returns the element at the beginning of this list
     *
     * @return the element at the beginning of this list
     */
    public Float get();

    /**
     * Returns the element at the specified position in this list
     *
     * @param index the index of the element to be returned
     * @return the element at the specified position in this list
     */
    public Float get(int index);

    /**
     * Returns the element's position if this list contains the specified element
     * otherwise returns 0
     *
     * @param value the element to be searched
     * @return the element's position if this list contains the specified element
     */
    public int search(Float value);

    /**
     * Returns true if this list contains the specified element.
     *
     * @param value element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    public boolean contains (Float value);
}
