public class SuperArrayTester {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    
    SuperArray t1 = new SuperArray();
    System.out.println(t1.size());
    System.out.println(t1.add("hello"));
    System.out.println(t1.size());
    System.out.println(t1.get(0));
    System.out.println(t1.set(0, "elephant"));
    System.out.println(t1.get(0));
  }
}
