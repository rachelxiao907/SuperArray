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

    SuperArray t2 = new SuperArray(5);
    System.out.println(t2.add("hello"));
    t2.add("white");
    t2.add("black");
    t2.add("green");
    t2.add("red");
    System.out.println(t2.toString());
    t2.add(5, "cat");
    t2.add(6, "dog");
    t2.add(7, "elephant");
    t2.add(8, "snake");
    t2.add(9, "rabbit");
    System.out.println(t2.toString());
    t2.add(6, "goat");
    System.out.println(t2.toString());
    System.out.println(t2.remove(9));
    System.out.println(t2.toString());
    System.out.println(t2.indexOf("bark"));
    System.out.println(t2.indexOf("elephant"));

    SuperArray t3 = new SuperArray();
    t3.add("white");
    t3.add("black");
    t3.add("green");
    t3.add("white");
    t3.add("black");
    t3.add("green");
    System.out.println(t3.indexOf("green"));
    System.out.println(t3.lastIndexOf("black"));
    System.out.println(t3.lastIndexOf("zack"));

    SuperArray t4 = new SuperArray();
    t4.add("white");
    t4.add("black");
    t4.add("green");
    t4.add("white");
    t4.add("black");
    t4.add("green");
    t4.add("rabbit");
    System.out.println(t3.equals(t4));

    System.out.println(t4.get(8));
  }
}
