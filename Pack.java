import Cal.*;

public class Pack {
    public static void main(String[] args) {
      Add sum = new Add();
      Sub diff = new Sub();
      int a=sum.plus(21,43);
      int b=diff.minus(23,24);
      System.out.print("The sum of 2 num: "+a+"\nThe diff is : "+b);
    }
}
