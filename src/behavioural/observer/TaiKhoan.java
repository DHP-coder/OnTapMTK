/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.observer;

/**
 *
 * @author DangHoaiPhong
 */
public class TaiKhoan implements ATM.ATMObserver {

    public int soDu;

    public TaiKhoan(int soDu) {
        this.soDu = soDu;
    }

    
    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if (soDu >= soTienRut) {
            soDu-=soTienRut;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void nhanThongBao(int soTienDaRut, String thongBao) {
        System.out.println(thongBao + ". Quy khach da rut "+soTienDaRut+". So du trong tai khoan con lai la: "+soDu);
    }

}
