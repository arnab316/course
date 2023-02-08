class computer{
  public String getMeApen(int cost)
{
    if(cost>= 10)
{
    return "pen";
}
else{ return "Nothing";}
}
  public void music(){
     System.out.println("playing music");

}
}


public class Hellow{
public static void main(String[] args) {

  computer obj = new computer();
   obj.music();
   String str = obj.getMeApen(1);
     System.out.println(str);

}
}
