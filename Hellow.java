class Mobile{
  String brand;
String  price;
static String   name;

// static block
static{
  name="Phone";
  System.out.println("in static block");
}
 

//constractor

public Mobile(){

   brand = "";
   price = "200";
   System.out.println("im a constractor");

}
   public void show(){
  System.out.println(brand + " " + price + " " + name);

   }
}
public class Hellow
{
public static void main(String[] args) throws ClassNotFoundException
{


   Class.forName("Mobile");

   // Mobile ob1 = new Mobile();
   //   ob1.brand = "Apple";
   //  ob1.price = "1000";
   //  Mobile.name = "Smartphone";     

   //  ob1.show();
   //  Mobile ob2 = new Mobile();
   //  ob2.brand = "Samsung";
   // ob2.price = "700";
   // Mobile.name = "Smartphone";
   // ob2.show();
   //  Mobile ob3 = new Mobile();

}
}

