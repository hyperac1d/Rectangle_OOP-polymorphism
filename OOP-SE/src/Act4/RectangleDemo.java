/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Act4;

public class RectangleDemo {
    public static void  main (String[] args) {
        //Class instantiation
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.5);
        Rectangle r3 = new Rectangle(5.5, 4.5);
        
        r1.displayArea();
        System.out.println("Area: "+r1.display_Area());
        r1.display_Area();
    }
}
