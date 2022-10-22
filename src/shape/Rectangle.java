package shape;

/**
 *
 * @author
 */
public class Rectangle {

    private int length; 
    private int breadth; 
    
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    
    public int getArea() { 
        return breadth*length; /* To calculate the area of the rectangle we must
        multiply the length by the width
        */
    } 
    
    // write code to calculate perimeter here
    // getPerimeter()
    
}