package corejava;

abstract class AbstractionExample 
{
    //feilds
	private int id; 
	private String name;
	private String address;
	//creating parameterized constructor
	public AbstractionExample(int id, String name, String address) 
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//create a method
	public void mailCheck() 
	{
		Syaten.out.println("Check Mail: "+this.name+this.address);
	}
	
	//create Getters and setters of id,name,address
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
