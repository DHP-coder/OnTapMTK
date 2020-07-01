/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DangHoaiPhong
 */
public class HoaDon {

    HoaDonHeader header;
    List<CTHD> cthds;

    public HoaDon(Builder builder) {
        this.header = builder.header;
        this.cthds = builder.cthds;
    }

    public static class Builder {

        HoaDonHeader header = new HoaDonHeader();
        List<CTHD> cthds = new ArrayList<>();


        public Builder addHeader(HoaDonHeader h){
            this.header = h;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd){
            cthds.add(cthd);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }

        
        
        
    }
    @Override
        public String toString() {
            String str="";
            str+=header.toString();
            str+="\n Thong tin hoa don \n";
            for(CTHD cthd: cthds){
                str+=cthd.toString();
            }
            return str;
        }
}
