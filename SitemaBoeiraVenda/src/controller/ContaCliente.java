/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.ContaClienteNvb;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas
 */
public class ContaCliente extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public ContaClienteNvb getbean(int linha){
return (ContaClienteNvb) lista.get(linha);
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
        ContaClienteNvb cc = (ContaClienteNvb) lista.get(rowIndex);
      if (columnIndex == 0) {
             return cc.getIdcontaClienteNvb();
        }
        if (columnIndex == 1) {
             return cc.getNomeNvb();
        }
        if (columnIndex == 2) {
             return cc.getPedidosNvb();
        }
        if (columnIndex == 3) {
             return cc.getAvaliacaoNvb();
        
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
             return "Pedidos";
        }
        if (columnIndex == 3) {
             return "Avaliação";
        }
        
    return null;
    }
    
}
