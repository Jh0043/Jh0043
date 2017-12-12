import java.awt.geom.*;
import java.util.ArrayList;
import gpdraw.*;
/**
 * Write a description of class IrregularPolygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IrregularPolygon
{
    private ArrayList <Point2D.Double> myPolygon;
    
    public IrregularPolygon(){
        
    }
    public void add(Point2D.Double aPoint){}
    public void draw() {}
    public double perimeter() {
        for(int i = 1; i < myPolygon.size(); i++){
            myPolygon.get(i);
            myPolygon.get(i+1);
            
            
            
               
        }
        return 1.0;
    }
    public double area() {
        return 1.0;
    }
}
