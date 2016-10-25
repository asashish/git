package com.learnjava;

class Person {
	String name;
	int age;
	
	void sayHello(){
		System.out.println("Hello "+name);
	}
	
	int calculator(){
		int retierment_age_cal = 65-age;
		return retierment_age_cal;
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
}

public class GeterAndSeter {

	public static void main(String[] args) {
		Person person1 =  new Person();
		person1.name = "Ashish";
		person1.age  = 25;
		int per1_ret_year = person1.calculator();
		System.out.println(per1_ret_year);
		
		Person person2 = new Person();
		person2.name = "Sharma";
		person2.age  = 21;
		int per2_ret_year = person2.calculator();
		System.out.println(per2_ret_year);
		
		int age = person1.getAge();
		System.out.println(age);
		
		String name = person1.getName();
		System.out.println(name);
	}
}
