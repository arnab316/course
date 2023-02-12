class Human{
  private String name;
  private int  age ;

  public String getName() {
    return name;
  }
  public void setName(String n) {
      name= n;  
}
  public int getAge() {
    return age;
  
}
}
public class Hellow
{
public static void main(String[] args) 
{

Human h1 = new Human();
h1.setName("Arnab");
      System.out.println(h1.getName());
}
}

