/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviourial.composite;

/**
 *
 * @author DangHoaiPhong
 */
public abstract class Khoa {
    String name, path;
    String prefix = "";

    public Khoa(String name) {
        this.name = name;
        this.path = name;
    }
    
    public abstract void add(Khoa item);
    public abstract void remove(Khoa item);
    public abstract String getTreeFolder();

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }
    
    
}
