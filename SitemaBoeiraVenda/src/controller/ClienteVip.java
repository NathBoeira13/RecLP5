/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.ClienteVipNvb;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas
 */
public class ClienteVip  extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public ClienteVipNvb getbean(int linha){
return (ClienteVipNvb) lista.get(linha);
}
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
      return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       ClienteVipNvb cv = (ClienteVipNvb) lista.get(rowIndex);
      if (columnIndex == 0) {
             return cv.getIdclienteVipNvb();
        }
        if (columnIndex == 1) {
             return cv.getNomeNvb();
        }
        if (columnIndex == 2) {
             return cv.getDataNascimentoNvb();
        }
        if (columnIndex == 3) {
             return cv.getSexoNvb();
        
        }
       
       return null;
       
    }
    
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Nome";
        }
        if (columnIndex == 2) {
             return "Data de Nascimento";
        }
        if (columnIndex == 3) {
             return "Sexo";
        }
    return null;
    }
    
}
