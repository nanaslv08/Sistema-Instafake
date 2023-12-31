/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JbsVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Janaína B da Silva
 */
public class VendedorControle extends AbstractTableModel{
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }
    
    public JbsVendedor getBean(int row){
        return (JbsVendedor) lista.get(row);
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
        JbsVendedor jbsVendedor = (JbsVendedor) lista.get(rowIndex);
        if(columnIndex == 0){
            return jbsVendedor.getJbsIdVendedor();
        }
        if(columnIndex == 1){
            return jbsVendedor.getJbsNome();
        }
        if(columnIndex == 2){
            return jbsVendedor.getJbsCpf();
        }
        if(columnIndex == 3){
            return jbsVendedor.getJbsCelular();
        }
        if(columnIndex == 4){
            return jbsVendedor.getJbsGenero();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if(column == 0){
            return "Id";
        }
        if(column == 1){
            return "Nome";
        }
        if(column == 2){
            return "Cpf";
        }
        if(column == 3){
            return "Celular";
        }
        if(column == 4){
            return "Genero";
        }
        return "";
    }
}
