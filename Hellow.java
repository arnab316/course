public class Hellow{
public static void main(String[] args) 
{

int num1 [][] = new int [3][4];
  //  num1 [0][2] = 6;
  //  num1 [1][0] = 3;
  //  num1 [2][3] = 2;
  //  System.out.println(num1 [1][0]);
 for(int i=0;i<3;i++){
  for(int j=0;j<4;j++){
    num1[i][j] = (int)(Math.random() * 10);

    System.out.print(num1[i][j]);
  }
 }



}
}

