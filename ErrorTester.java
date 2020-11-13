public class ErrorTester {
  public static void main(String[] args) {
    SuperArray test = new SuperArray(10);
    for (int i = 0; i < 10; i++) {
      test.add("yes");
    }

    //constructor
    try {
      SuperArray t1 = new SuperArray(-8);  //throws an exception
    } catch (IllegalArgumentException e) {
      System.out.println("\nCONSTRUCTOR has an illegal argument");
      e.printStackTrace();
    }

    //get
    try {
      test.get(-9);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("\nGET has an index out of bounds");
      e.printStackTrace();
    }
    try {
      test.get(9);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("\nGET has an index out of bounds");
      e.printStackTrace();
    }

    //set
    try {
      SuperArray t3 = new SuperArray(5);
      t3.add("no");
      t3.set(1, "hello");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("\nSET has an index out of bounds");
      e.printStackTrace();
    }

    //add
    try {
      test.add(10,"hi");
    } catch (IndexOutOfBoundsException e) {
       System.out.println("\nADD has an index out of bounds");
       e.printStackTrace();
    }
    try {
      SuperArray t4 = new SuperArray();
      t4.add(1,"hi");
    } catch (IndexOutOfBoundsException e) {
       System.out.println("\nADD has an index out of bounds");
       e.printStackTrace();
    }

    //remove
    try {
      test.remove(11);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("\nREMOVE has an index out of bounds");
      e.printStackTrace();
    }
  }
}
