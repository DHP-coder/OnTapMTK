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
public class ChiTietGioHang extends Command{

    String tenMatHang;
    int soLuong, donGia;
    Store store;

    public ChiTietGioHang(String tenMatHang, int soLuong, int donGia, Store store) {
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.store = store;
    }
    
    @Override
    public void datMuaHang() {
        store.muaHang();
    }
    
}
