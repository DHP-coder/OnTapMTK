/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.single_and_factory;

/**
 *
 * @author DangHoaiPhong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape retangle = shapeFactory.createShape(ShapeType.Triangle);
        
        retangle.setBrush("Muc");
        retangle.setPaper("Giay");
        retangle.setFrame("Co");
        System.out.println(retangle.draw()+retangle.toString());
    }
    
}
