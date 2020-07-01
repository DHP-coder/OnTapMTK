/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

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
        HoaDon hd = new HoaDon.Builder()
                .addHeader(new HoaDonHeader("HD001", "20/1/2020", "Nguyen"))
                .addCTHD(new CTHD("May tinh", 1, 2000000, (float) 0.2))
                .build();
        System.out.println(hd.toString());
    }
    
}
