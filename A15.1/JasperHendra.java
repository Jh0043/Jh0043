import java.awt.geom.*;
import java.util.ArrayList;
import gpdraw.*;
/**
 * Write a description of class IrregularPolygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JasperHendra implements Polygon
{
    private ArrayList <Point2D.Double> myPolygon;

    public JasperHendra(){
        this.myPolygon = new ArrayList<Point2D.Double>();
        
    }
    public void add(Point2D.Double aPoint){
        this.myPolygon.add(aPoint);
        
        }
    public void draw() {
        SketchPad myPaper = new SketchPad(500, 500);
        
        DrawingTool pencil;
        pencil = new DrawingTool(myPaper);
        pencil.home();
        int g = myPolygon.size() - 1;
        for(int i = 0; i <= g ; i++){
            //i <= g to be able to reach the x-1
            /*
             * Debugging
             *
             *System.out.println("x: " + myPolygon.get(i).getX());
             *System.out.println("y: " + myPolygon.get(i).getY());
             */
            pencil.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
            
            
            
        }
        pencil.move((myPolygon.get(0)).getX(), myPolygon.get(0).getY());
        //move from the end of x-1 to the beginning
    }
    public double perimeter() {
        // tested and working
        double peri = 0.0;
        int j = myPolygon.size() - 1;
        int hj = myPolygon.size();
        
        int counter = 0;
        for(int i = 0; i < j; i++){
            //counter++;
            peri += Math.sqrt(Math.pow((myPolygon.get(i+1)).getX() 
                - (myPolygon.get(i)).getX(), 2)
                + Math.pow((myPolygon.get(i+1)).getY() 
                - (myPolygon.get(i)).getY(), 2));
            //myPolygon.get(i+1).getX();
        }
        //System.out.println("peri: " + peri); debugging
        
        //this code represent getting the last to the start part of the 
        // polygon
        peri += Math.sqrt(Math.pow((myPolygon.get(j)).getX()
            - (myPolygon.get(0)).getX(), 2) 
            + Math.pow((myPolygon.get(j)).getY() 
            - (myPolygon.get(0)).getY(), 2));
        //System.out.println("counter: " + counter); debugging
        //rounding to the 100 place
        peri = peri * 100;
        peri = (double)((int) peri);
        peri = peri/100;
        return peri;
    }
    public double area() {
        // -----------UNTESTED------------------
        int Area = 1;
        //double fPx = 0.0;
        //first part starting with x
        //double sPy = 0.0;
        //second part starting with y
        int j = myPolygon.size() -1;
        
        for(int i = 0; i < myPolygon.size(); i++){
            Area += (myPolygon.get(j).getX() + myPolygon.get(i).getX()) 
                * (myPolygon.get(j).getY() - myPolygon.get(i).getY());
            j = i;
            // the reason for j is to start from the last coordinate rather 
            // than the first
        }
        
        
        //disregard the stuff on the bottom
        //these were attempts to create the shoelace formula but failed
        
        /*
        for(int i = 0; i < myPolygon.size() - 1; i++){
            fPx += (myPolygon.get(i)).getX() * (myPolygon.get(i+1)).getY();
        }
        for(int i = 0; i < myPolygon.size() - 1; i++){
            sPy -= myPolygon.get(i).getX() * myPolygon.get(i+1).getY();
        }
        */
        
        //attempted to code shoelace formula
        /*
        for(int i = 0; i < myPolygon.size(); i++){
            //myPolygon.get(i).getX() * myPolygon.get(i+1).getY()
            //    + myPolygon.get(i+1).getX() * myPolygon.get(i+2).getY(); 
            // -1 * (myPolygon.get(i).getY() * myPolygon.get(i+1).getY()
            //    + myPolygon.get(i+1).getY() * myPolygon.get(i+2).getY();
            fPx = (myPolygon.get(i)).getX() * (myPolygon.get(i+1)).getY()
                    + (myPolygon.get(i+1)).getX() * (myPolygon.get(i+2)).getY(); 
            sPy = -1 * ((myPolygon.get(i)).getY() * (myPolygon.get(i+1)).getY()
                    + (myPolygon.get(i+1)).getY() * (myPolygon.get(i+2)).getY());
            
        }
        */
        //(myPolygon.get(myPolygon.size() - 1)).getX() 
        //    * (myPolygon.get(0)).getY();
        // - (myPolygon.get(myPolygon.size() - 1)).getY() 
        //     * (myPolygon.get(0)).getX();
        /*
        Area = Math.abs(fPx + sPy);
        System.out.println("fPx: " + fPx);
        System.out.println("sPy: " + sPy);
        Area = Area * (0.5);
        */
       
        Area = Math.abs(Area / 2);
        return Area;
    }
    public String getName(){
        return "Jasper Hendra";
    }
}
