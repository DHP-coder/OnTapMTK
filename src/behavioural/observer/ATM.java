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
public class ATM {
    ATMObserver observer;
    
    public void thietLapTaiKhoan(ATMObserver observer){
        this.observer = observer;
    }
    private boolean kiemTraTienRut(int soTienRut){
        return observer.kiemTraSoDu(soTienRut);
    }
    public void rutTien(int soTien){
        if(kiemTraTienRut(soTien))
            observer.nhanThongBao(soTien, "Giao dich thanh cong");
        else
            observer.nhanThongBao(0, "Giao dich khong thanh cong");
    }
    public static interface ATMObserver{
        boolean kiemTraSoDu(int soTienRut);
        void nhanThongBao(int soTienDaRut, String thongBao);
    }
}
