//Program to get area of various shapes 
class Shape{
	//Instance variables 
	final double PI=3.14;
	float radius;
	float side;
	
	void display() {
		System.out.println("The Area of various shapes are:");
	}
	
}
class Circle extends Shape{  //inheritance using extend keyword
	
	
	void getArea(float radius) { //Method to calculate the area of circle
		super.display();   // invoking the parent class method here 
		
		this.radius=radius;
		
	}
	void display() {  //method to display the area of circle
		System.out.println("Area of the Circle is"+" "+PI*Math.pow(radius,2));
	}
	
}
class Square extends Shape{ //inheriting the square class 
	void getArea(int side) { // calculate the area of square 
		this.side=side;
		
	}
	void display() { // display method to print the area of square
		System.out.println("Area of the square is"+" "+side*side);
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(); //creating the object of parent call
		c.getArea(3); //calling method of child  class circle and pass the values to arguments 
		c.display();
		Square s=new Square();// object of child class square
		s.getArea(2);// calling method of child class square and pass the values to arguments 
		s.display();

	}

}
