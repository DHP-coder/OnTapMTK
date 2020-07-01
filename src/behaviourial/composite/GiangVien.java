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
public class GiangVien extends Khoa{

    public GiangVien(String name) {
        super(name);
    }

    @Override
    public void add(Khoa item) {
    }

    @Override
    public void remove(Khoa item) {
    }

    @Override
    public String getTreeFolder() {
        return this.prefix + this.name;
    }
    
}
