/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1arqui2;

import javax.swing.JTable;

/**
 *
 * @author arman
 */
public class memoria {
    
    JTable Mem;
    Interfaz ui;
    
    memoria(Interfaz ui){
        this.ui=ui;
        this.Mem=ui.retornarTableMemoria("TablaMem");
        
    }
    
    public String BuscarDir(String dir){
        
        if(dir.equals("000")){
            return "m:"+(String) this.Mem.getValueAt(0, 0);
        }else if(dir.equals("001")){
            return "m:"+(String) this.Mem.getValueAt(0, 1);
        }else if(dir.equals("010")){
            return "m:"+(String) this.Mem.getValueAt(0, 2);
        }else if(dir.equals("011")){
            return "m:"+(String) this.Mem.getValueAt(0, 3);
        }else if(dir.equals("100")){
            return "m:"+(String) this.Mem.getValueAt(0, 4);
        }else if(dir.equals("101")){
            return "m:"+(String) this.Mem.getValueAt(0, 5);
        }else if(dir.equals("110")){
            return "m:"+(String) this.Mem.getValueAt(0, 6);
        }else{
            return "m:"+(String) this.Mem.getValueAt(0, 7);
        }
       
        
    } 
    
    public void CambiarValorEnDir(String dir, String Dat){
        if(dir.equals("000")){
            this.Mem.setValueAt(Dat, 0, 0);
        }else if(dir.equals("001")){
            this.Mem.setValueAt(Dat, 0, 1);
        }else if(dir.equals("010")){
            this.Mem.setValueAt(Dat, 0, 2);
        }else if(dir.equals("011")){
            this.Mem.setValueAt(Dat, 0, 3);
        }else if(dir.equals("100")){
            this.Mem.setValueAt(Dat, 0, 4);
        }else if(dir.equals("101")){
            this.Mem.setValueAt(Dat, 0, 5);
        }else if(dir.equals("110")){
            this.Mem.setValueAt(Dat, 0, 6);
        }else{
            this.Mem.setValueAt(Dat, 0, 7);
        }
    }
    
    
}
