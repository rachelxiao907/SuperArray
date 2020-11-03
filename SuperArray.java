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

}
