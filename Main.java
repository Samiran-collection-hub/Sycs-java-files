import Cal.*;

public class Main {
    public static void main(String[] args) {
      Add sum = new Add();
      Sub diff = new Sub();
      System.out.print("The sum of 2 num: "+sum.plus(12, 43)+"\nThe diff is : "+diff.minus(23,24));
    }
}
