
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pacoteTarefa.Tarefa;
import pacoteTarefa.TarefaTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaon
 */
public class xmlConversor {
    XStream xstream;
    TarefaTableModel modelo;
    public xmlConversor(TarefaTableModel model){
        xstream = new XStream(new StaxDriver());
        xstream.alias("listaTarefa", ArrayList.class);
        xstream.alias("Tarefa", Tarefa.class);
        modelo = model;
    }
    
    public void exportar(){
        
       
        
       FileOutputStream fos = null;
      
        try {
             File arq = new File("C:\\Users\\isaon\\Downloads\\testeTarefa","listaTarefas.xml");
            fos = new FileOutputStream(arq);
                String xml  = xstream.toXML(modelo.getListaTarefas());
                    byte[] bytes = xml.getBytes("UTF-8");
                    fos.write(bytes);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(xmlConversor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(xmlConversor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(xmlConversor.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            if(fos!=null) {
                try {
                    fos.close();
                } catch (IOException ex) {
                    Logger.getLogger(xmlConversor.class.getName()).log(Level.SEVERE, null, ex);
                
               
            }
        }
        
    }
    }
    
  public void importar() {
    try (FileInputStream fis = new FileInputStream(new File("C:\\Users\\isaon\\Downloads\\testeTarefa\\listaTarefas.xml"))) {
      xstream.allowTypeHierarchy(pacoteTarefa.Tarefa.class); // Allow Tarefa hierarchy
      xstream.alias("listaTarefa", ArrayList.class);
      xstream.alias("Tarefa", Tarefa.class);
      ArrayList<Tarefa> importada = (ArrayList<Tarefa>) xstream.fromXML(fis);
      modelo.addTarefas(importada);
    } catch (FileNotFoundException ex) {
      Logger.getLogger(xmlConversor.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(xmlConversor.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
}