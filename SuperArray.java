public class SuperArray {
  private String[] data;
  private int size;  //the current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("Initial Capacity " + initialCapacity + " cannot be negative");
    }
    data = new String[initialCapacity];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size == data.length) resize();
    data[size] = element;
    size++;  //adding elements means increasing size
    return true;
  }

  public String get(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index " + index + " cannot be out of range of the SuperArray");
    }
    return data[index];
  }

  public String set(int index, String element) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index " + index + " cannot be out of range of the SuperArray");
    }
    String replaced = data[index];
    data[index] = element;
    return replaced;
  }

  private void resize() {
    String[] arr = new String[data.length * 2 + 2];
    for (int i = 0; i < data.length; i++) {
      arr[i] = data[i];
    }
    data = arr;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    data = new String[data.length];
    size = 0;
  }

  public String toString() {
    if (size == 0) return "[]";
    String display = "[";
    for (int i = 0; i < size - 1; i++) {
      display += data[i] + ", ";
    }
    return display + data[size-1] + "]";
  }

  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element) {
    if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException("Index " + index + " cannot exceed the size of the Super Array");
    }
    if (size == data.length) resize();
    String[] arr = new String[data.length];
    for (int i = 0; i < index; i++) {
      arr[i] = data[i];
    }
    arr[index] = element;
    for (int i = index; i < data.length - 1; i++) {
      arr[i+1] = data[i];
    }
    data = arr;
    size++;
  }

  public String remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("Index " + index + " is not in the Super Array");
    }
    String removed = data[index];
    for (int i = index; i < size - 1; i++) {
      data[i] = data[i+1];
    }
    data[size-1] = null;
    size--;
    return removed;
  }

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] arr = new String[size];
    for (int i = 0; i < size; i++) {
      arr[i] = data[i];
    }
    return arr;
  }

  public int lastIndexOf(String value) {
    for (int i = size-1; i >= 0; i--) {
      if (data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other) {
    for (int i = 0; i < size; i++) {
      if (!data[i].equals(other.data[i])) {
        return false;
      }
    }
    if (size != other.size) return false;
    return true;
  }

}
