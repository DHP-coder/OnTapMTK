/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioural.template;

import java.util.ArrayList;

/**
 *
 * @author DangHoaiPhong
 */
public abstract class EntityDB<T> {
    ArrayList<T> list = new ArrayList<>();
    
    public boolean add(T t){
        int id = getKey(t);
        T item = findByID(id);
        if(item==null){
            list.add(t);
            return true;
        }
        return false;
    }
    
    public int update(T t){
        int id = getKey(t);
        T item = findByID(id);
        if(item!=null){
            list.remove(item);
            list.add(t);
            return 1;
        }
        return 0;
    }
    
    public int delete(T t){
        int id = getKey(t);
        T item = findByID(id);
        if(item!=null){
            list.remove(item);
            return 1;
        }
        return 0;
    }
    
    protected abstract T findByID(int id);
    public int deleteByKey(int id){
        return 1;
    }
    
    protected abstract int getKey(T t);
}
