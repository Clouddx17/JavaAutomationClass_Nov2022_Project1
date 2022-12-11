package pkg1;

public class Student {
	int rollno ;
	int age ;
	
	public void Display1()
	{ System.out.println("Welcome to all of you ! ");}

    public void Display2()
    { System.out.println("Automation is very easy . ");
  }

    public static void main(String[] args) 
    {
    Student ABC = new Student() ;
    ABC.Display1();
    ABC.Display2();
    ABC.rollno = 11;
    ABC.age = 21;
    System.out.println("Student's age is "+ABC.age+" & "+"Student's roll number is "+ ABC.rollno+ ".");
    
    
    
    }

}