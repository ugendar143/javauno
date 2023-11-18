package uno.career;

public class RectangleAreaPerimeter {

	public static void main(String[] args) {
	 int length=3;
	 int breadth=6;
     int  area =length*breadth;
     int perimeter=2*(length+breadth);
     System.out.println(area);
     System.out.println(perimeter);
     if(perimeter>area) {
    	 System.out.println("Perimeter is greater than area");
     }else if(area>perimeter){
    	 System.out.println("Area is greater than perimeter"); 
     }else {
    	 System.out.println("Area is equal to perimeter");
     }
    
	}
}
