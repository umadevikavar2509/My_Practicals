package corejava;

public class Person
{
	

//Fields
 private String name;
 private int age;
 
//Method
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 
//Creating Getter and Setter
     
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