public class Personne {
	
//1. Write a Java program to create a class called "Person" with a name and age attribute. 
	//Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
String name;
int age;
//constructeur
public Personne(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
//methode 
public void nameage() {
		System.out.println("the name of "+ name +" the age of "+ age);
	}
public static void main (String args[]) {
	//public void Person () {
		//System.out.println(name+"" + age +"");
		Personne p1 = new Personne ("essya " , 22 );
		Personne p2 = new Personne ("Adam ",23);
		Personne p3 = new Personne ("yassmine ", 15);
		
		p1.nameage();
		p2.nameage();
		p3.nameage();
}
}