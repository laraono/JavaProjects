package pacoteTarefa;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author isaon
 */
public class Tarefa implements Comparable {
    private Integer prioridade;
    private String desc;
    private Boolean alarme;
    private Date conclusao;

    public Tarefa(Integer prioridade, String desc, Boolean alarme, Date conclusao) {
        this.prioridade = prioridade;
        this.desc = desc;
        this.alarme = alarme;
        this.conclusao = conclusao;
    }

    @Override
    public String toString() {
        return desc;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Integer prioridade) {
        this.prioridade = prioridade;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getAlarme() {
        return alarme;
    }

    public void setAlarme(Boolean alarme) {
        this.alarme = alarme;
    }

    public Date getConclusao() {
        return conclusao;
    }

    public void setConclusao(Date conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public int compareTo(Object o) {
        Tarefa outra = (Tarefa) o;
        if(outra.prioridade != 0 && this.prioridade !=0){
        return this.prioridade-outra.prioridade;
        } else if(outra.prioridade != 0){ 
        return outra.prioridade;
        } else if(this.prioridade !=0){
        return -this.prioridade;    
        }else{
        return 0;
        }
        
    }
   
    
    
}
