public class SuperArrayTester {
  public static void main(String[] args) {
    // SuperArray words = new SuperArray();
    // words.add("kani");
    // words.add("ebi");
    // for(int i = 0; i < words.size(); i++){
    //   System.out.println( words.get(i) );
    // }

    SuperArray t1 = new SuperArray();
    System.out.println(t1.size());
    System.out.println(t1.add("hello"));
    System.out.println(t1.size());
    System.out.println(t1.get(0));
    System.out.println(t1.set(0, "elephant"));
    System.out.println(t1.get(0));

    t1.add("hi");
    t1.add("dog");
    System.out.println(t1.size());
    System.out.println(t1.isEmpty());
    System.out.println(t1.toString());
    System.out.println(t1.contains("go"));

    t1.clear();
    System.out.println(t1.size());
    System.out.println(t1.toString());

    SuperArray t2 = new SuperArray(10);
    System.out.println(t2.add("hello"));
    System.out.println(t2.add("white"));
    System.out.println(t2.add("black"));
    System.out.println(t2.add("green"));
    System.out.println(t2.add("red"));
    System.out.println(t2.toString());
    t2.add(5, "cat");
    t2.add(6, "dog");
    t2.add(7, "dog");
    t2.add(8, "dog");
    t2.add(9, "dog");
    System.out.println(t2.toString());
    t2.remove(9);
    System.out.println(t2.toString());
    System.out.println(t2.indexOf("bark"));
  }
}
