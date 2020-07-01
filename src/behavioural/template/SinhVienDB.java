/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.template;

/**
 *
 * @author DangHoaiPhong
 */
public class SinhVienDB extends EntityDB<SinhVien>{

    @Override
    protected SinhVien findByID(int id) {
        for(SinhVien sinhvien: list){
            if(id==getKey(sinhvien)){
                return sinhvien;
            }
        }
        return null;
    }

    @Override
    protected int getKey(SinhVien sv) {
        return sv.getMaSV();
    }

    @Override
    public String toString() {
        String s="";
        for (SinhVien sv : list) {
            s+= "MaSV:" + sv.getMaSV()+"\n";
        }
        return s;
    }
    
    
    
}
