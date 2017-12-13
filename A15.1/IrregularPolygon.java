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
        this.myPolygon = new ArrayList<Point2D.Double>();
    }
    public void add(Point2D.Double aPoint){
        this.myPolygon.add(aPoint);
    
        }
    public void draw() {}
    public double perimeter() {
        // -----------UNTESTED------------------
        double peri = 0.0;
        
        //attempted to code distance formula
        
        for(int i = 1; i < myPolygon.size()-1; i++){
            peri = Math.sqrt(Math.pow((myPolygon.get(i+1)).getX() 
                - (myPolygon.get(i)).getX(), 2)
                + Math.pow((myPolygon.get(i+1)).getY() 
                - (myPolygon.get(i)).getY(), 2));
            //myPolygon.get(i+1).getX();
        }
        return peri;
    }
    public double area() {
        // -----------UNTESTED------------------
        double Area = 0.0;
        double fPx = 0.0;
        //first part starting with x
        double sPy = 0.0;
        //second part starting with y
        double xOf
        for(int i = 0; i < myPolygon.size(); i++){
            myPolygon.get(i).getX();
                
        }
        for(int j = 1; j < myPolygon.size(); j++){
            myPolygon.get(j).getY();
        }
        //attempted to code shoelace formula

        for(int i = 0; i < myPolygon.size(); i++){
            //myPolygon.get(i).getX() * myPolygon.get(i+1).getY()
            //    + myPolygon.get(i+1).getX() * myPolygon.get(i+2).getY(); 
            // -1 * (myPolygon.get(i).getY() * myPolygon.get(i+1).getY()
            //    + myPolygon.get(i+1).getY() * myPolygon.get(i+2).getY();
            
            //fPx = (myPolygon.get(i)).getX() * (myPolygon.get(i+1)).getY()
            //        + (myPolygon.get(i+1)).getX() * (myPolygon.get(i+2)).getY(); 
            //sPy = -1 * ((myPolygon.get(i)).getY() * (myPolygon.get(i+1)).getY()
            //        + (myPolygon.get(i+1)).getY() * (myPolygon.get(i+2)).getY());
            fPx = (myPolygon.get(i)).getX() * (myPolygon.get(i+1)).getY()
                    + (myPolygon.get(i+1)).getX() * (myPolygon.get(i+2)).getY(); 
            sPy = -1 * ((myPolygon.get(i)).getY() * (myPolygon.get(i+1)).getY()
                    + (myPolygon.get(i+1)).getY() * (myPolygon.get(i+2)).getY());
            
        }
        //(myPolygon.get(myPolygon.size() - 1)).getX() 
        //    * (myPolygon.get(0)).getY();
        // - (myPolygon.get(myPolygon.size() - 1)).getY() 
        //     * (myPolygon.get(0)).getX();
        Area = Math.abs((0.5) * (fPx + sPy));
        
        return Area;
    }
    public String getName(){
        return "Jasper Hendra";
    }
}
