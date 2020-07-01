/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DangHoaiPhong
 */
public class GioHang {

    List<Command> gioHang = new ArrayList<>();
    Store store = new Store();

    public void xacNhanMuaHang(String tenMatHang, int soLuong, int donGia) {
        Command ctgh = new ChiTietGioHang(tenMatHang, soLuong, donGia, store);
        ctgh.datMuaHang();
        gioHang.add(ctgh);
    }
    
    public void tinhTienGioHang(){
        System.out.println("Tong tien hang: "+ store.tinhTienGioHang());
    }
}
