class A {
   public A(){ // default constructor

      System.out.println("i'm A");
   }
   public A(int n) { // parameterized constructor
      System.out.println("i am number " + n);
   }

}

class B extends A{
   public B() { // default constructor
        super();
      System.out.println("i am b");
 }
       public B(int n) { // parameterized constructor
           super(5);
         System.out.println("i am number " + n);

      }

}

public class Hellow {
   public static void main(String[] args) {
      B obj = new B();

   }
}
