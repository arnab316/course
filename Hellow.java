class Human{

  private String name;
  private int  age ;
  
public Human(){
   name = "john";
   age= 20;
}



public Human(String name, int age) {
   this.name = name;
   this.age = age;
}



public String getName() {
   return name;
}
public void setName(String name) {
   this.name = name;
}
public int getAge() {
   return age;
}
public void setAge(int age) {
   this.age = age;
}


  
}

public class Hellow
{
public static void main(String[] args) 
{
   Human h1=new Human();
   //h1.setAge(19);      
   //h1.setName("Ravi");
   System.out.println(h1.getName()+ " "+h1.getAge());


}
}

