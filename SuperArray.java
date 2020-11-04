public class SuperArray {
  private String[] data;
  private int size;  //the current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    for (int i = 0; i < data.length; i++) {
      if (data[i] == null) {
        size = i;
        i = data.length;
      }
    }
    return size;
  }

  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
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
    String[] arr = new String[data.length + 10];
    for (int i = 0; i < data.length; i++) {
      arr[i] = data[i];
    }
    data = arr;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

  public void clear() {
    String[] reset = new String[data.length];
    data = reset;
  }

}
