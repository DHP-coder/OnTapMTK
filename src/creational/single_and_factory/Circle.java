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
public class Circle extends Shape{

    @Override
    public String draw() {
        return "Ve hinh tron";
    }
    
    private static Circle intance;
    
    public static Circle Intance(){
        if(intance == null)
            intance = new Circle();
        return intance;
    }
}
