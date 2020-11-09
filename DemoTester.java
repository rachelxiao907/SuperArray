public class DemoTester {
  public static void main(String[]args) {
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    Demo.removeDuplicates(words);
    System.out.println(words);


    SuperArray t1 = new SuperArray();
    t1.add("9");
    t1.add("1");
    t1.add("2");
    t1.add("2");
    t1.add("3");
    t1.add("4");
    SuperArray t2 = new SuperArray();
    t2.add("0");
    t2.add("4");
    t2.add("2");
    t2.add("2");
    t2.add("9");
    System.out.println(Demo.findOverlap(t1, t2));

    SuperArray t3 = new SuperArray();
    t3.add("a");
    t3.add("b");
    t3.add("c");
    t3.add("d");
    t3.add("e");
    t3.add("f");
    SuperArray t4 = new SuperArray();
    t4.add("0");
    t4.add("1");
    t4.add("2");
    t4.add("3");
    System.out.println(Demo.zip(t3, t4));
  }
}
