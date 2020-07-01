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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Khoa root = new BoMon("Toan");
        root.add(new GiangVien("Nguyen Thi A"));
        System.out.println(root.getTreeFolder());
    }
    
}
