public class Excephndling {
    public static void main(String[] args) {
      int[] a = {5,10};
      int b = 5;
      try {
        int x = a[1]/(b-a[0]);
      } catch(ArithmeticException ae) {
        System.out.println(ae);
        System.out.println("Can't divite by 0");
      } catch(IndexOutOfBoundsException ab) {
        System.out.println(ab);
        System.out.println("Array error");
      } finally {
        System.out.println("rest of the code");
      }
    }
}
