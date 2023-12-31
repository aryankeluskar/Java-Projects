
public interface IList<T extends Comparable<T>> {
   /**
    * Adds an element at the end of the list.
    */
   public void add(T item);

   /**
    * Stores a new item at a specified index
    * Throws NoSuchElementException if index is out of bounds.
    */
   public void set(int index, T item);

   /**
    * Inserts an element at the specified index
    * Throws NoSuchElementException if index is out of bounds.
    */
   public void insert(int index, T item);

   /**
    * Removes the element at the specified index
    * Throws NoSuchElementException if index is out of bounds.
    */
   public void remove(int index);

   /**
    * Returns the element at the specified index
    * Throws NoSuchElementException if index is out of bounds.
    */
   public T get(int index);

   /**
    * Returns the size of the list.
    * 
    * @return the number of elements in the list
    */
   public int size();
}
