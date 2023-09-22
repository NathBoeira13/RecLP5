/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.EntregaNvb;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas
 */
public class Entrega  extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public EntregaNvb getbean(int linha){
return (EntregaNvb) lista.get(linha);
}
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
      return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     EntregaNvb e = (EntregaNvb) lista.get(rowIndex);
      if (columnIndex == 0) {
             return e.getIdentregaNvb();
        }
        if (columnIndex == 1) {
             return e.getNomeNvb();
        }
        if (columnIndex == 2) {
             return e.getPrecoNvb();
        }
        if (columnIndex == 3) {
             return e.getDescontoNvb();
        
        }
         if (columnIndex == 4) {
             return e.getFreteNvb();
        
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
             return "Preço";
        }
        if (columnIndex == 3) {
             return "Desconto";
        }
        if (columnIndex == 4) {
             return "Frete";
        }
    return null;
    }
    
}
