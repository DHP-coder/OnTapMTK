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
public class ShapeFactory {
    
    public Shape createShape (ShapeType shapeType){
        switch(shapeType){
            case Retangle: return  Retangle.Intance();
            case Triangle: return Triangle.Intance();
            case Circle: return Circle.Intance();
        }
        return null;
    }
}
