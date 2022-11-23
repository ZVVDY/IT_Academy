package task.task8;

import java.util.Collection;

/**
 * Интерфейс методов MyArrayList
 */
public interface MyList<T> {
    int size();

    boolean isEmpty();

    boolean contains(Object value);

    boolean add(T value);

    boolean add(int index, T value);

    boolean remove(Object value);

    boolean addAll(Collection<? extends T> value);

    T get(int index);

    T remove(int index);

    T set(int index, T value);

    int indexOf(Object value);
}
