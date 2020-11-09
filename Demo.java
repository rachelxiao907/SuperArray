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

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray arr = new SuperArray();
    for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
      arr.add(a.get(i));
      arr.add(b.get(i));
    }
    if (a.size() > b.size()) {
      for (int j = b.size(); j < a.size(); j++) {
        arr.add(a.get(j));
      }
    } else if (b.size() > a.size()) {
      for (int j = a.size(); j < b.size(); j++) {
        arr.add(b.get(j));
      }
    }
    return arr;
  }

}
