public class Square {   
int width;  
int height;
int depth;  
  
Square(){  
System.out.println("this a default constructor");  
}  
  
Square(int w, int h, int d){  
width = w;  
height = h;
depth = d;  
}  
  
public static void main(String[] args) {    
Square s = new Square();  
System.out.println("\nDefault Constructor values: \n");  
System.out.println("Square width : "+s.width + "\nSquare Height : "+s.height);  
  
System.out.println("\nConstructor overloading values: \n");  
Square square = new Square(10, 2,30);  
System.out.println("Square width : "+square.width + "\nsquare Height : "+square.height + "\nsquare depth : "+square.depth);  
}  
}  