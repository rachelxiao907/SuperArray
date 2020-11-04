public class SuperArray {
  private String[] data;
  private int size;  //the current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity) {
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
    return data[index];
  }

  public String set(int index, String element) {
    String replaced = data[index];
    data[index] = element;
    return replaced;
  }

  private void resize() {
    String[] arr = new String[data.length * 2 + 1];
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
    for (int i = 0; i < data.length; i++) {
      if (data[i] == s) {
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element) {
    if (size == data.length) resize();
    String[] arr = new String[data.length];
    for (int i = 0; i < index; i++) {
      arr[i] = data[i];
    }
    arr[index] = element;
    for (int i = index; i < size; i++) {
      arr[i+1] = data[i];
    }
    data = arr;
    size++;
  }

}
