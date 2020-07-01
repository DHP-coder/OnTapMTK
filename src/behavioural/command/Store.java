/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.command;

/**
 *
 * @author DangHoaiPhong
 */
public class Store {
    int total = 0;
    String tenMatHang;
    int soLuong, donGia;
    
    public void muaHang(){
        total+=soLuong*donGia;
        StringBuilder builder = new StringBuilder();
        builder.append(tenMatHang)
                .append("\t\t\t")
                .append(soLuong)
                .append("\t\t\t")
                .append(total);
        
    }
    
    public int tinhTienGioHang(){
        return total;
    }
}
