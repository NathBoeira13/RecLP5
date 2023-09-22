/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.AgendamentoProdutoNvb;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas
 */
public class AgendamenbtoProduto extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public AgendamentoProdutoNvb getbean(int linha){
return (AgendamentoProdutoNvb) lista.get(linha);
}
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
      return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AgendamentoProdutoNvb aps = (AgendamentoProdutoNvb) lista.get(rowIndex);
      if (columnIndex == 0) {
             return aps.getIdagendamentoProdutoNvb();
        }
        if (columnIndex == 1) {
             return aps.getEmailNvb();
        }
        if (columnIndex == 2) {
             return aps.getValorNvb();
        }
        if (columnIndex == 3) {
             return aps.getProdutoNvb();
        
        }
        if (columnIndex == 4) {
             return aps.getNomeClienteNvb();
        
        }
        if (columnIndex == 5) {
             return aps.getNomeFuncionarioNvb();
        
        }
       return null;
       
    }
    
    @Override
    public String getColumnName(int columnIndex){
        if (columnIndex == 0) {
             return "ID";
        }
        if (columnIndex == 1) {
             return "Email";
        }
        if (columnIndex == 2) {
             return "Valor";
        }
        if (columnIndex == 3) {
             return "Produto";
        }
        if (columnIndex == 4) {
             return "Cliente";
        }
         if (columnIndex == 5) {
             return "Funcionario";
        }
    return null;
    }
}

