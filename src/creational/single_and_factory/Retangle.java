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
public class Retangle extends Shape{
    
    public Retangle(String brush, String paper, String frame) {
        super(brush, paper, frame);
    }

    private Retangle() {
    }


    

    @Override
    public String draw() {
        return "Ve hinh chu nhat";
    }
    
        private static Retangle intance;

        public static Retangle Intance(){
            if(intance == null)
                intance = new Retangle();
            return intance;
        }
}
