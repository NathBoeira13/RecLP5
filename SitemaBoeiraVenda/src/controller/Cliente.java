/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.ClienteNvb;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lucas
 */
public class Cliente  extends AbstractTableModel {
private List lista;

public void setList(List lista){
this.lista=lista;
}
public  void setlist(List lista){
this.lista = lista;
}

public ClienteNvb getbean(int linha){
return (ClienteNvb) lista.get(linha);
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
        ClienteNvb c = (ClienteNvb) lista.get(rowIndex);
      if (columnIndex == 0) {
             return c.getIdclienteNvb();
        }
        if (columnIndex == 1) {
             return c.getNomeNvb();
        }
        if (columnIndex == 2) {
             return c.getApelidoNvb();
        }
        if (columnIndex == 3) {
             return c.getIdadeNvb();
        
        }
        if (columnIndex == 4) {
             return c.getDataNascimentoNvb();
        
        }
        if (columnIndex == 5) {
             return c.getTelefoneNvb();
        
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
             return "Apelido";
        }
        if (columnIndex == 3) {
             return "Idade";
        }
        if (columnIndex == 4) {
             return "Data Nascimento";
        }
         if (columnIndex == 5) {
             return "Telefone";
        }
    return null;
    }
    
}
