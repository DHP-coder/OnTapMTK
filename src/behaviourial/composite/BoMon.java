/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behaviourial.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DangHoaiPhong
 */
public class BoMon extends Khoa{

    List<Khoa> listBoMon = new ArrayList<>();

    public BoMon(String name) {
        super(name);
    }
    @Override
    public void add(Khoa item) {
        if(!listBoMon.contains(item)){
            listBoMon.add(item);
            item.path = this.path + "\\" + item.path;
            item.prefix = this.prefix + "..";
        }
    }

    @Override
    public void remove(Khoa item) {

    }

    @Override
    public String getTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(prefix).append(name);
        for(Khoa khoa:listBoMon)
        {
        builder.append("\n").append(khoa.getTreeFolder());
        }
        return builder.toString();
    }
    
}
