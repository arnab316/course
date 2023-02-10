class Student{
  int rollno;
  String name;
  int marks;

}
public class Hellow{
public static void main(String[] args) 
{
   
    Student s1=new Student();
    s1.rollno=101;
    s1.name="Ravi";
    s1.marks=90;
    
    Student s2=new Student();
    s2.rollno=102;
    s2.name="rogan";
    s2.marks=80;
    Student s3 = new Student();
    s3.rollno=103;  
    s3.name="alex";
    s3.marks=70;  
     // System.out.println(s3); // garbage value we get
   Student students[] = new Student[3];
   students[0] = s1;
   students[1] = s2;
   students[2] = s3;
   
  for(Student std : students){
    System.out.println(std.name +" : "+  std.rollno);
  }

 
  // for (int i=0; i<students.length; i++)
  // {
  //   System.out.print(students[i].name + ": "+ students[i].marks);
  // }
 
  int arr1[] = new int [3];


  // int arr2 []= {4,5,7,33};
  //  for(int n : arr2){
  //   System.out.println(n);
  //  }

 
}
}

