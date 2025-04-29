class Student {
	private String name;
	private int rollNo;
	private String course;
 
	// Constructor
	Student(String name, int regNo, String course) {
		this.name=name;
		rollNo=regNo;
		this.course=course;
	}
 
	// Getters and Setters
	public String getName() { return name; }
	public void setName(String name) { 
		this.name=name;
	}
	
	public int getrollNo(){return rollNo;}
	public void setrollNo(int rollNo){
		this.rollNo=rollNo;
	}
	
	public String getcourse(){return course;}
	public void setcourse(String course){
		this.course=course;
	}

	public void display() {
		System.out.println("Name - "+name);
		System.out.println("Roll No - "+rollNo);
		System.out.println("Course - "+course);
	}
 }
 
class Rectangle {
	private int length;
	private int breadth;
	
	Rectangle() {
	this.length=0;
	this.breadth=0;
	}
	
	Rectangle(int length, int breadth) {
	this.length=length;
	this.breadth=breadth;
	}
	
	public int area() {
	return length*breadth;
	}
 }
 
class Calculator {
	int add(int a, int b) { return a + b; }
	
	int add(int a, int b, int c){return a+b+c;}
	
	double add (double a, double b){return a+b;}
	
 }
 
class Vehicle {
	String brand;
	int speed;
 
	void display() {
		System.out.println("Brand - "+brand);
		System.out.println("Speed - "+speed);
	}
 }
 
class Car extends Vehicle {
	String model;

	@Override
	void display() {
	super.display();
	System.out.println("Model - "+model);
	}
 }
 
class BankAccount {
	private String accountHolderName;
	private double balance;
 
	public void deposit(double amount) {
		balance +=amount;
	}
		
	public void withdraw(double amount) { 
		if(balance >= amount){
			balance -= amount;
		} else{
			System.out.println("Not enough Money!!");
		}
		
	}
		
	public void displayBalance() { 
		System.out.println("balance - "+balance);
	}
 }
 
 
class Book {
	private String title;
	private String author;
	private double price;
 
	Book(String title, String author, double price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
 
	Book(String title, String author) {
		this.title=title;
		this.author=author;
		price=0;
	}
 }
 
class Shape {
	void area() {
		System.out.println("Area not defined");
	}
 }
 
class Circle extends Shape {
	double radius;
 
	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	void area() {
		System.out.println("Area : "+(Math.PI*Math.pow(radius,2)));
	}
 }
 
class Person {
	private String name;
	private int age;
 
	public String getName() { return name; }
	public void setName(String name) { this.name=name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age=age; }
}
 
class TemperatureConverter {
	double toFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
 
	double toCelsius(double fahrenheit) {
		return (fahrenheit- 32) * 5/9;
	}
}

class Employee {
	String name;
	int id;
	double salary;
 
	Employee(String name, int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}

	void displayDetails() {
		System.out.println("Name - " +name);
		System.out.println("ID - " +id);
		System.out.println("Salary - " +salary);
	}
 }
 
class Manager extends Employee {
	Manager(String name, int id, double salary) {
		super(name, id, salary);
	}
 
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Bonus");
	}
 }
 
public class Tester {
	public static void main(String[] args) {
		// Q1: Student
		Student student = new Student("John Doe", 101, "Information Technology");
		student.display();

		// Q2: Rectangle
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(5, 10);
		System.out.println("Area of rect2: " + rect2.area());
 
		// Q3: Calculator
		Calculator calc = new Calculator();
		System.out.println("Add two integers: " + calc.add(2, 3));
		System.out.println("Add three integers: " + calc.add(2, 3, 4));
		System.out.println("Add two doubles: " + calc.add(2.5, 3.5));
 
		// Q4: Vehicle and Car
		Car car = new Car();
		car.brand = "Toyota";
		car.speed = 120;
		car.model = "Corolla";
		car.display();
 
		// Q5: BankAccount
		BankAccount account = new BankAccount();
		account.deposit(5000);
		account.withdraw(1500);
		account.displayBalance();
 
		// Q6: Book
		Book book1 = new Book("Java Basics", "Author A", 300.0);
		Book book2 = new Book("Python Essentials", "Author B");
 
		// Q7: Shape and Circle
		Circle circle = new Circle(5.0);
		circle.area();
 
		// Q8: Person
		Person person = new Person();
		person.setName("Alice");
		person.setAge(25);
		System.out.println("Person Name: " + person.getName());
		System.out.println("Person Age: " + person.getAge());
 
		// Q9: TemperatureConverter
		TemperatureConverter converter = new TemperatureConverter();
		System.out.println("30 Celsius to Fahrenheit: " + converter.toFahrenheit(30));
		System.out.println("86 Fahrenheit to Celsius: " + converter.toCelsius(86));
 
		// Q10: Employee and Manager
		Manager manager = new Manager("Bob", 201, 75000);
		manager.displayDetails();
	}
}