import java.util.*;

class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int p = sc.nextInt();
        for (int i=2;i<p; i++){
          if (p%i==0){
            System.out.println("Not a prime");
          } else {
            System.out.println(p+" Is a prime number");
          }
        } 
    }
}
