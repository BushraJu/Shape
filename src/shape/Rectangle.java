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
    
   public int getPerimeter() { 
        return 2*(breadth+length); /* To calculate the Perimeter of the 
        rectangle we must multiply 2 the length by the width by the summition of
        the width and the length  */
    } 
    
}