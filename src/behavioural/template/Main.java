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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv = new SinhVien(1, "Dang Hoai Phong", "59CNTT2");
        SinhVien sv1 = new SinhVien(2, "Dang Hoai Phong 1", "59CNTT2");
        SinhVien sv2 = new SinhVien(3, "Dang Hoai Phong 2", "59CNTT2");
        SinhVien sv3 = new SinhVien(4, "Dang Hoai Phong 3", "59CNTT2");
        
        EntityDB<SinhVien> entityDB = new SinhVienDB();
        entityDB.add(sv);
        entityDB.add(sv1);
        entityDB.add(sv2);
        entityDB.add(sv3);
        
        System.out.println(entityDB.toString());
    }
    
}
