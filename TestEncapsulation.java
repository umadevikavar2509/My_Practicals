package corejava;

public class TestEncapsulation 
{
public static void main(String[] args)
{
    //creating object of class EncapsulationExample
	EncapculationExample encap= new EncapculationExample();
	//object is use to access the methods of class
	encap.setId(25);
	encap.setName("Uma");
	System.out.println("Id: "+encap.getId()+ "\n"+ "Name: "+encap.getName());
	
	
}

}
