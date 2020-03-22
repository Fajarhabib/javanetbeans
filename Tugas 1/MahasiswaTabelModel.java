/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.tabel;


import com.app.entity.Mahasiswa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class MahasiswaTabelModel extends AbstractTableModel{

    private List<Mahasiswa> list;

    public MahasiswaTabelModel() {
    }

    public MahasiswaTabelModel(List<Mahasiswa> list) {
        this.list = list;
    }
    
    
    @Override
    public int getRowCount() {
return list.size();
    }

    @Override
    public int getColumnCount() {
return 6;
    }

    @Override
    public Object getValueAt(int i, int i1) {
return  list.get(i).getValue(i1);
    }

    private String[] column ={"NIM","NAMA","JURUSAN","ALAMAT","EMAIL","TELEPON"};
    @Override
    public String getColumnName(int i) {
return column[i];
    }
    
    
}
