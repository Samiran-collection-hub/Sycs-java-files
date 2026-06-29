class A{
  int add(int a,int b){
    return a+b;
  }
  int add(int a,int b,int c){
    return a+b+c;
  }
  void dis(){
    System.out.println("class parnet");
  }
}
class B extends A{
  void dis(){
    System.out.println("class child");
  }
}

public class prac2over{
    public static void main(String[] args) {
      B b= new B();
      System.out.println("the 2 sums :" + b.add(5,5));
      System.out.println("the 3 sums :" + b.add(5,5,5));
      b.dis();
    }
}
