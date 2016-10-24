package com.udemy;

class Person
{
	String name;
	int age;

	void sayHello(){
		System.out.println("hello");
		System.out.println("I am "+name+" and i am "+age+" year old");		
	}
	
}

class ClassAndObjects {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "Ashish";
		person1.age  = 24;
		person1.sayHello();
		
		Person person2 = new Person();
		person2.name = "Sharma";
		person2.age = 10;
		person2.sayHello();
	}

}
