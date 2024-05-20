/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacoteTarefa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author isaon
 */
public class TarefaTableModel extends AbstractTableModel {
    private ArrayList<Tarefa> listaTarefas;
    private String[] colunas = {"Prioridade","Tarefa","Alarme","Conclusão"};
   private Integer editable = -1; 

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }
   
           
    public TarefaTableModel() {
        this.listaTarefas = new ArrayList<Tarefa>();
    }
    
    public void editaTarefa(int row) {
        this.editable = row;
     }
    
    public void addTarefa(Tarefa task){
        this.listaTarefas.add(task); 
        fireTableDataChanged();
    }
    
    public void removeTarefa(int rowIndex){
        this.listaTarefas.remove(rowIndex);
        fireTableDataChanged();
    }
    
   public void sortLista(){
       Collections.sort(listaTarefas);
   }
    public void concluiTarefa(int rowIndex){
       int priori = this.listaTarefas.get(rowIndex).getPrioridade(); 
        String desc = this.listaTarefas.get(rowIndex).getDesc();
        Boolean alarme = this.listaTarefas.get(rowIndex).getAlarme();
        Date dataConclusao =  new Date();
        Tarefa concluida = new Tarefa(priori,desc,alarme,dataConclusao);
        this.listaTarefas.set(rowIndex, concluida);
        System.out.print(dataConclusao);
        fireTableDataChanged();
    }
    
    public void sobeTarefa(int rowIndex){
        
        int priori = this.listaTarefas.get(rowIndex).getPrioridade();
        if(priori > 1){
        String desc = this.listaTarefas.get(rowIndex).getDesc();
        Boolean alarme = this.listaTarefas.get(rowIndex).getAlarme();
        Date data =  this.listaTarefas.get(rowIndex).getConclusao();
        Tarefa sobe = new Tarefa(priori-1,desc,alarme,data);
        this.listaTarefas.set(rowIndex, sobe);
           fireTableDataChanged();
        }
    }
    
    @Override
    public int getRowCount() {
        return this.listaTarefas.size();
    }

    @Override
    public int getColumnCount() {
       return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      
        switch(columnIndex){
            case 0:
                  Integer prioridade = this.listaTarefas.get(rowIndex).getPrioridade();
                if(prioridade != 0){
                return prioridade.toString();
                } else {
                return "";
                        }
                
            case 1: return this.listaTarefas.get(rowIndex).getDesc();
            case 2: 
                Boolean alarme = this.listaTarefas.get(rowIndex).getAlarme();
                 if(alarme){
                return "S";
                } else {
                return "N";
                        }
            case 3:
                Date data = this.listaTarefas.get(rowIndex).getConclusao();
                if(data != null){
                return data.getDate()+"/"+(data.getMonth()+1)+"/"+(data.getYear()+1900);}
                else 
                {
                return "";
                }
            default: return this.listaTarefas.get(rowIndex);
        }
        
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
       Tarefa row = this.listaTarefas.get(rowIndex);
       switch(columnIndex){
           case 0: row.setPrioridade(Integer.parseInt((String) aValue)); break;
           case 1: row.setDesc((String) aValue); break;
           case 2:
               if(aValue.equals("S")){
               row.setAlarme(true); 
               } else {
                   row.setAlarme(false); 
               }
               break;
           //case 3: row.setConclusao((Date) aValue); break;
       }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        if(row == this.editable) {return true;}
        return false;
    }

    public void addTarefas(ArrayList<Tarefa> importada) {
        this.listaTarefas.addAll(importada);
         fireTableDataChanged();
    }

  
    

}
