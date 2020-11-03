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
    data[size] = element;
    size++;  //adding elements means increasing size
    return true;
  }

  public String get(int index) {
    return data[index];
  }

}
