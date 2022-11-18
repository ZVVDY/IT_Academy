package task.task8;

import java.util.Arrays;
import java.util.Collection;

/**
 * Класс реализации методов MyArrayList
 */
public class MyArrayList<T> implements MyList<T> {
    private static final int CAPACITY = 12;
    private int capacity;
    private Object[] array;
    private int size;

    public MyArrayList() {
        capacity = CAPACITY;
        array = new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    public MyArrayList(MyList<? extends T> col) {

    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {

        return false;
    }

    @Override
    public boolean contains(Object value) {

        return indexOf(value) >= 0;
    }

    @Override
    public boolean add(Object value) {
        if (array.length == size) {
            growingArray();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = value;
                size++;
                break;
            }
        }
        return true;
    }

    @Override
    public boolean add(int index, T value) {
        checkingIndex(index);
        if (array.length == size) {
            growingArray();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object value) {
        if (value == null) {
            return false;
        } else if (size == 0) {
            return false;
        } else {
            for (int i = 0; i < size; i++) {
                if (value.equals(array[i])) {
                    System.arraycopy(array, i + 1, array, i, size - i);
                    size--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> value) {

        return true;
    }

    @Override
    public T get(int index) {
        checkingIndex(index);
        return (T) array[index];

    }

    @Override
    public T remove(int index) {
        Object tempObject = null;
        checkingIndex(index);
        tempObject = array[index];
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        return (T) tempObject;
    }

    @Override
    public T set(int index, T value) {
        checkingIndex(index);
        return (T) (array[index] = value);
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "capacity=" + capacity +
                ", array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    @Override
    public int indexOf(Object value) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (value.equals(array[i])) {
                result = i;
                break;
            }
        }
        return result;

    }

    private void growingArray() {
        array = Arrays.copyOf(array, array.length / 2 + array.length + 1);
    }

    private void checkingIndex(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }
}