public class Demo {
  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < s.size(); i++) {
      if (i != s.indexOf(s.get(i))) {
        s.remove(i);
        i--;
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    removeDuplicates(b);
    SuperArray arr = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) {
        arr.add(a.get(i));
      }
    }
    return arr;
  }

}
