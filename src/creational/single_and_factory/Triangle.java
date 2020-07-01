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
public class Triangle extends Shape{

    @Override
    public String draw() {
        return "Ve hinh tam giac";
    }
    
    private static Triangle intance;
    
    public static Triangle Intance(){
        if(intance == null)
            intance = new Triangle();
        return intance;
    }
    
}
