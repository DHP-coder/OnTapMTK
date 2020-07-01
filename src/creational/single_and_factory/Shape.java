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
public abstract class Shape {
    private String brush, paper, frame;

    public Shape(String brush, String paper, String frame) {
        this.brush = brush;
        this.paper = paper;
        this.frame = frame;
    }
    
    public abstract String draw();
    
    public Shape(){
        
    }

    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Shape{" + "brush=" + brush + ", paper=" + paper + ", frame=" + frame + '}';
    }
    
    
}
