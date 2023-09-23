

import org.junit.Test;

import static org.junit.Assert.*;


public class FloatArrayListTest {

    public FloatArrayListTest() {
    }

    public FloatArrayList initialize() {

        FloatArrayList instance = new FloatArrayList(6);

        instance.add(Float.valueOf(3));
        instance.add(Float.valueOf(8));
        instance.add(Float.valueOf(12));

        return instance; //[12, 8, 3]
    }

    /**
     * Test of size method, of class FloatArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        FloatArrayList instance = initialize();

        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class FloatArrayList.
     */
    @Test
    public void testIsempty1() {
        System.out.println("isEmpty");
        FloatArrayList instance = initialize();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of isEmpty method, of class FloatArrayList.
     */
    @Test
    public void testIsempty2() {
        System.out.println("isEmpty");
        FloatArrayList instance = new FloatArrayList(2);
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);

    }

    /**
     * Test of add method, of class FloatArrayList.
     */
    @Test
    public void testAdd_Float() {
        System.out.println("add");
        FloatArrayList instance = new FloatArrayList(3);
        assertTrue(instance.isEmpty());
        instance.add(Float.valueOf(2));
        assertFalse(instance.isEmpty());
        assertEquals(instance.size(), 1);
    }

    /**
     * Test of add and remove methods, of class FloatArrayList.
     */
    @Test
    public void testAdd_int_Remove() {
        System.out.println("add");
        int index = 3;
        Float value = Float.valueOf(5);
        FloatArrayList instance = initialize(); // [12, 8, 3]
        instance.add(index, value); // [12, 8, 5, 3]
        assertEquals(instance.size(), 4);
        Float remove = instance.remove();
        assertEquals(12.0, remove, 0.01);
        remove = instance.remove();
        assertEquals(8.0, remove, 0.01);
        remove = instance.remove();
        assertEquals(5.0, remove, 0.01);
        remove = instance.remove();
        assertEquals(3.0, remove, 0.01);
        assertTrue(instance.isEmpty());
    }

    /**
     * Test of remove method, of class FloatArrayList.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int index = 2;
        FloatArrayList instance = initialize(); // [12, 8, 3]
        Float result = instance.remove(index);// 8
        assertEquals(8.0, result, 0.01);

    }

    /**
     * Test of get method, of class FloatArrayList.
     */
    @Test
    public void testGet_0args() {
        System.out.println("get");
        FloatArrayList instance = initialize(); // [12, 8, 3]
        Float result = instance.get();//12
        assertEquals(12.0, result, 0.01);

    }

    /**
     * Test of get method, of class FloatArrayList.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int index = 2;
        FloatArrayList instance = initialize(); // [12, 8, 3]
        Float result = instance.get(index);// 8
        assertEquals(8.0, result, 0.01);

    }

    /**
     * Test of search method, of class FloatArrayList.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        Float value = Float.valueOf(5);
        FloatArrayList instance = initialize();// [12, 8, 3]
        int expResult = 0;
        int result = instance.search(value);
        assertEquals(expResult, result);
        value = Float.valueOf(3);
        expResult = 3;
        result = instance.search(value);
        assertEquals(expResult, result);
    }

    /**
     * Test of contains method, of class FloatArrayList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Float value = Float.valueOf(5);
        FloatArrayList instance = initialize();// [12, 8, 3]
        boolean result = instance.contains(value);
        assertFalse(result);
        value = Float.valueOf(12);
        result = instance.contains(value);
        assertTrue(result);
    }

}
