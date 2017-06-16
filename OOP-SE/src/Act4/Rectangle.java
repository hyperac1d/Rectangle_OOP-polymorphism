/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Act4;

/**
 *
 * @author Student Account
 */
public class Rectangle {
    double length;
    double width;
    
    Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
        System.out.println("First Constructor Loaded");
    }
    Rectangle(double length){
        this.length = length;
        this.width = 0.0;
        System.out.println("Second Constructor Loaded");
    }
    Rectangle(double length, double width){
        this.width = width;
        this.length = 0.0;
        System.out.println("Third Constructor Loaded");
    }
    
    //getter of length, width
    double getLength() {
        return this.length;
    }
    
    double getWidth() {
        return this.width;
    }
    
    //setter of length
    void setLength(double length) {
        this.length = length;
    }
    
    void setWidth(double width){
        this.width = width; 
    }
    
    //procedural
    void displayArea(){
        double area = length * width;
        System.out.println("Area: "+area);
    }
    
    //functional
    double display_Area(){
        double area=length*width;
        return area;
    }
}
