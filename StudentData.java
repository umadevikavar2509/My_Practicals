package corejava;

public class StudentData 
{
	public static void main(String[] args)
	{
	    //creating object of class Student
		Student s= new Student();
		//object is use to access the methods of class
		s.setId(25);
		s.setName("Uma");
		s.setAge(30);
		System.out.println("Student Data"+"\n"+"Id: "+s.getId()+ "\n"+ "Name: "+s.getName()+"\n"+"Age: "+s.getAge());
		
		
	}

}
