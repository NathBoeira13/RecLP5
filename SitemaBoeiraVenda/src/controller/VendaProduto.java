/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.VendaProdutoNvb;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas
 */
public class VendaProduto  extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public VendaProdutoNvb getbean(int linha){
return (VendaProdutoNvb) lista.get(linha);
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
       VendaProdutoNvb vp = (VendaProdutoNvb) lista.get(rowIndex);
      if (columnIndex == 0) {
             return vp.getIdvendaProdutoNvb();
        }
        if (columnIndex == 1) {
             return vp.getClienteNvb();
        }
        if (columnIndex == 2) {
             return vp.getClienteVipNvb();
        }
        if (columnIndex == 3) {
             return vp.getDataVendaNvb();
        
        }
       if (columnIndex == 4) {
             return vp.getValorNvb();
        
        }
       return null;
       
    }
    
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Cliente";
        }
        if (columnIndex == 2) {
             return "Funcionario";
        }
        if (columnIndex == 3) {
             return "Dia da Venda";
        }
        if (columnIndex == 4) {
             return "Valor";
        }
    return null;
    }
    
}

