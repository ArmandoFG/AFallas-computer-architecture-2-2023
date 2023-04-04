package proyecto1arqui2;


import javax.swing.JTable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arman
 */
public class ModuloJTable {
    
    JTable bloque1;
    JTable bloque2;
    JTable bloque3;
    JTable bloque4;
    memoria mem;
    
    ModuloJTable(JTable bloque1, JTable bloque2, JTable bloque3, JTable bloque4, memoria mem){
        this.bloque1 = bloque1;
        this.bloque2 = bloque2;
        this.bloque3 = bloque3;
        this.bloque4 = bloque4;
        this.mem = mem;
        
    }
    
    
    public void CambiarValorBloqueEstado(JTable bloque, String Valor){
        bloque.setValueAt(Valor, 0, 1);
    }
    
    public void CambiarValorBloquedir(JTable bloque, String Valor){
        bloque.setValueAt(Valor, 1, 1);
    }
    
    public void CambiarValorBloquedat(JTable bloque, String Valor){
        bloque.setValueAt(Valor, 2, 1);
    }
    
    public String buscarDirCache(String dir){
        if(bloque1.getValueAt(1, 1)!= null && bloque1.getValueAt(1, 1).equals(dir)){
            if(!bloque1.getValueAt(0, 1).equals("I")){
                return "bloque1";
            }else{
                return "miss";
            }
            
        }else if(bloque2.getValueAt(1, 1)!= null && bloque2.getValueAt(1, 1).equals(dir)){
            if(!bloque2.getValueAt(0, 1).equals("I")){
                return "bloque2";
            }else{
                return "miss";
            }
        }
        else if(bloque3.getValueAt(1, 1)!= null && bloque3.getValueAt(1, 1).equals(dir)){
            if(!bloque3.getValueAt(0, 1).equals("I")){
                return "bloque3";
            }else{
                return "miss";
            }
        }else if(bloque4.getValueAt(1, 1)!= null && bloque4.getValueAt(1, 1).equals(dir)){
            if(!bloque4.getValueAt(0, 1).equals("I")){
                return "bloque4";
            }else{
                return "miss";
            }
        }else{
            return "miss";
        }
        
    }
    
    
    public String retornarValorCacheRead(String bloque){
        if(bloque.equals("bloque1")){
            if(bloque1.getValueAt(0, 1).equals("M")){
                bloque1.setValueAt("O", 0, 1);
            }else if(bloque1.getValueAt(0, 1).equals("E")){
                bloque1.setValueAt("S", 0, 1);
            }
            return (String) bloque1.getValueAt(2, 1);
        }else if(bloque.equals("bloque2")){
            if(bloque2.getValueAt(0, 1).equals("M")){
                bloque2.setValueAt("O", 0, 1);
            }else if(bloque2.getValueAt(0, 1).equals("E")){
                bloque2.setValueAt("S", 0, 1);
            }
            return (String) bloque2.getValueAt(2, 1);
        }else if(bloque.equals("bloque3")){
            if(bloque3.getValueAt(0, 1).equals("M")){
                bloque3.setValueAt("O", 0, 1);
            }else if(bloque3.getValueAt(0, 1).equals("E")){
                bloque3.setValueAt("S", 0, 1);
            }
            return (String) bloque3.getValueAt(2, 1);
        }else{
            if(bloque4.getValueAt(0, 1).equals("M")){
                bloque4.setValueAt("O", 0, 1);
            }else if(bloque4.getValueAt(0, 1).equals("E")){
                bloque4.setValueAt("S", 0, 1);
            }
            return (String) bloque4.getValueAt(2, 1);
        }
    }
    
    public void IngresarDatoJTableRead(String dir, String dat, String last_dat, String procedencia){
        
        if(last_dat.equals("0")){
            if(bloque1.getValueAt(1, 1)==null || bloque1.getValueAt(0, 1).equals("I")){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque1,"E");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque1,"S");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                }
                
                
            }else if(bloque2.getValueAt(1, 1)==null || bloque2.getValueAt(0, 1).equals("I")){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque2,"E");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque2,"S");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                }
            }else if(bloque1.getValueAt(1, 1).equals(dir)){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque1,"E");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque1,"S");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                }
            }else if(bloque2.getValueAt(1, 1).equals(dir)){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque2,"E");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque2,"S");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                }
            }else if(bloque1.getValueAt(0, 1).equals("S") || bloque1.getValueAt(0, 1).equals("E")){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque1,"E");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque1,"S");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                }
            }else if(bloque2.getValueAt(0, 1).equals("S") || bloque2.getValueAt(0, 1).equals("E")){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque2,"E");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque2,"S");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                }
            }else if(bloque1.getValueAt(0, 1).equals("M") || bloque1.getValueAt(0, 1).equals("O")){
                mem.CambiarValorEnDir((String) this.bloque1.getValueAt(1, 1), (String) this.bloque1.getValueAt(2, 1));
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque1,"E");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque1,"S");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                }
            }else if(bloque2.getValueAt(0, 1).equals("M") || bloque2.getValueAt(0, 1).equals("O")){
                mem.CambiarValorEnDir((String) this.bloque2.getValueAt(1, 1), (String) this.bloque2.getValueAt(2, 1));
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque2,"E");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque2,"S");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                }
            }
        }else{
            if(bloque3.getValueAt(1, 1)==null || bloque3.getValueAt(0, 1).equals("I")){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque3,"E");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque3,"S");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                }
            }else if(bloque4.getValueAt(1, 1)==null || bloque4.getValueAt(0, 1).equals("I")){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque4,"E");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque4,"S");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                }
            }else if(bloque3.getValueAt(1, 1).equals(dir)){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque3,"E");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque3,"S");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                }
            }else if(bloque4.getValueAt(1, 1).equals(dir)){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque4,"E");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque4,"S");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                }
            }else if(bloque3.getValueAt(0, 1).equals("S") || bloque3.getValueAt(0, 1).equals("E")){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque3,"E");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque3,"S");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                }
            }else if(bloque4.getValueAt(0, 1).equals("S") || bloque4.getValueAt(0, 1).equals("E")){
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque4,"E");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque4,"S");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                }
            }else if(bloque3.getValueAt(0, 1).equals("M") || bloque3.getValueAt(0, 1).equals("O")){
                mem.CambiarValorEnDir((String) this.bloque3.getValueAt(1, 1), (String) this.bloque3.getValueAt(2, 1));
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque3,"E");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque3,"S");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                }
            }else if(bloque4.getValueAt(0, 1).equals("M") || bloque4.getValueAt(0, 1).equals("O")){
                mem.CambiarValorEnDir((String) this.bloque4.getValueAt(1, 1), (String) this.bloque4.getValueAt(2, 1));
                if(procedencia.equals("m")){
                    CambiarValorBloqueEstado(this.bloque4,"E");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                }else if(procedencia.equals("c")){
                    CambiarValorBloqueEstado(this.bloque4,"S");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                }
            }
        }
        
    }
    
    public String IngresarDatoJTableWrite(String dir, String dat, String last_dat){
        if(last_dat.equals("0")){
            if(bloque1.getValueAt(1, 1)!= null && bloque1.getValueAt(1, 1).equals(dir)){
                if(bloque1.getValueAt(0, 1).equals("I")){
                    CambiarValorBloqueEstado(this.bloque1,"M");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                    return "nada";
                }else if(bloque1.getValueAt(0, 1).equals("S")){
                    CambiarValorBloqueEstado(this.bloque1,"M");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                    return "invalidar";
                }else if(bloque1.getValueAt(0, 1).equals("E")){
                    CambiarValorBloqueEstado(this.bloque1,"M");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                    return "nada";
                }else if(bloque1.getValueAt(0, 1).equals("M")){
                    CambiarValorBloqueEstado(this.bloque1,"M");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                    return "nada";
                }else if(bloque1.getValueAt(0, 1).equals("O")){
                    CambiarValorBloqueEstado(this.bloque1,"M");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                    return "invalidar";
                }

            }else if(bloque2.getValueAt(1, 1)!= null && bloque2.getValueAt(1, 1).equals(dir)){
                if(bloque2.getValueAt(0, 1).equals("I")){
                    CambiarValorBloqueEstado(this.bloque2,"M");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                    return "nada";
                }else if(bloque2.getValueAt(0, 1).equals("S")){
                    CambiarValorBloqueEstado(this.bloque2,"M");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                    return "invalidar";
                }else if(bloque2.getValueAt(0, 1).equals("E")){
                    CambiarValorBloqueEstado(this.bloque2,"M");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                    return "nada";
                }else if(bloque2.getValueAt(0, 1).equals("M")){
                    CambiarValorBloqueEstado(this.bloque2,"M");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                    return "nada";
                }else if(bloque2.getValueAt(0, 1).equals("O")){
                    CambiarValorBloqueEstado(this.bloque2,"M");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                    return "invalidar";
                }

            }else if(bloque1.getValueAt(1, 1)==null){
                CambiarValorBloqueEstado(this.bloque1,"M");
                CambiarValorBloquedir(this.bloque1,dir);
                CambiarValorBloquedat(this.bloque1,dat);
                return "invalidar";
            }else if(bloque2.getValueAt(1, 1)==null){
                CambiarValorBloqueEstado(this.bloque2,"M");
                CambiarValorBloquedir(this.bloque2,dir);
                CambiarValorBloquedat(this.bloque2,dat);
                return "invalidar";
            }else{
                if(bloque1.getValueAt(0, 1).equals("I")){
                    CambiarValorBloqueEstado(this.bloque1,"M");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                    return "invalidar";
                }else if(bloque2.getValueAt(0, 1).equals("I")){
                    CambiarValorBloqueEstado(this.bloque2,"M");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                    return "invalidar";
                }else if(bloque1.getValueAt(0, 1).equals("S")){
                    CambiarValorBloqueEstado(this.bloque1,"M");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                    return "invalidar";
                }else if(bloque2.getValueAt(0, 1).equals("S")){
                    CambiarValorBloqueEstado(this.bloque2,"M");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                    return "invalidar";
                }else if(bloque1.getValueAt(0, 1).equals("E")){
                    CambiarValorBloqueEstado(this.bloque1,"M");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                    return "invalidar";
                }else if(bloque2.getValueAt(0, 1).equals("E")){
                    CambiarValorBloqueEstado(this.bloque2,"M");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                    return "invalidar";
                }else if(bloque1.getValueAt(0, 1).equals("M")){
                    mem.CambiarValorEnDir((String) this.bloque1.getValueAt(1, 1), (String) this.bloque1.getValueAt(2, 1));
                    CambiarValorBloqueEstado(this.bloque1,"M");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                    return "invalidar";
                }else if(bloque2.getValueAt(0, 1).equals("M")){
                    mem.CambiarValorEnDir((String) this.bloque2.getValueAt(1, 1), (String) this.bloque2.getValueAt(2, 1));                    
                    CambiarValorBloqueEstado(this.bloque2,"M");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                    return "invalidar";
                }else if(bloque1.getValueAt(0, 1).equals("O")){
                    mem.CambiarValorEnDir((String) this.bloque1.getValueAt(1, 1), (String) this.bloque1.getValueAt(2, 1));
                    CambiarValorBloqueEstado(this.bloque1,"M");
                    CambiarValorBloquedir(this.bloque1,dir);
                    CambiarValorBloquedat(this.bloque1,dat);
                    return "invalidar";
                }
                else if(bloque2.getValueAt(0, 1).equals("O")){
                    mem.CambiarValorEnDir((String) this.bloque2.getValueAt(1, 1), (String) this.bloque2.getValueAt(2, 1));                    
                    CambiarValorBloqueEstado(this.bloque2,"M");
                    CambiarValorBloquedir(this.bloque2,dir);
                    CambiarValorBloquedat(this.bloque2,dat);
                    return "invalidar";
                }
            }
        }else {
            if(bloque3.getValueAt(1, 1)!= null && bloque3.getValueAt(1, 1).equals(dir)){
                if(bloque3.getValueAt(0, 1).equals("I")){
                    CambiarValorBloqueEstado(this.bloque3,"M");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                    return "nada";
                }else if(bloque3.getValueAt(0, 1).equals("S")){
                    CambiarValorBloqueEstado(this.bloque3,"M");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                    return "invalidar";
                }else if(bloque3.getValueAt(0, 1).equals("E")){
                    CambiarValorBloqueEstado(this.bloque3,"M");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                    return "nada";
                }else if(bloque3.getValueAt(0, 1).equals("M")){
                    CambiarValorBloqueEstado(this.bloque3,"M");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                    return "nada";
                }else if(bloque3.getValueAt(0, 1).equals("O")){
                    CambiarValorBloqueEstado(this.bloque3,"M");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                    return "invalidar";
                }
            
            }else if(bloque4.getValueAt(1, 1)!= null && bloque4.getValueAt(1, 1).equals(dir)){
                if(bloque4.getValueAt(0, 1).equals("I")){
                    CambiarValorBloqueEstado(this.bloque4,"M");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                    return "nada";
                }else if(bloque4.getValueAt(0, 1).equals("S")){
                    CambiarValorBloqueEstado(this.bloque4,"M");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                    return "invalidar";
                }else if(bloque4.getValueAt(0, 1).equals("E")){
                    CambiarValorBloqueEstado(this.bloque4,"M");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                    return "nada";
                }else if(bloque4.getValueAt(0, 1).equals("M")){
                    CambiarValorBloqueEstado(this.bloque4,"M");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                    return "nada";
                }else if(bloque4.getValueAt(0, 1).equals("O")){
                    CambiarValorBloqueEstado(this.bloque4,"M");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                    return "invalidar";
                }

            }else if(bloque3.getValueAt(1, 1)==null){
                CambiarValorBloqueEstado(this.bloque3,"M");
                CambiarValorBloquedir(this.bloque3,dir);
                CambiarValorBloquedat(this.bloque3,dat);
                return "invalidar";
            }else if(bloque4.getValueAt(1, 1)==null){
                CambiarValorBloqueEstado(this.bloque4,"M");
                CambiarValorBloquedir(this.bloque4,dir);
                CambiarValorBloquedat(this.bloque4,dat);
                return "invalidar";
            }else{
                if(bloque3.getValueAt(0, 1).equals("I")){
                    CambiarValorBloqueEstado(this.bloque3,"M");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                    return "invalidar";
                }else if(bloque4.getValueAt(0, 1).equals("I")){
                    CambiarValorBloqueEstado(this.bloque4,"M");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                    return "invalidar";
                }else if(bloque3.getValueAt(0, 1).equals("S")){
                    CambiarValorBloqueEstado(this.bloque3,"M");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                    return "invalidar";
                }else if(bloque4.getValueAt(0, 1).equals("S")){
                    CambiarValorBloqueEstado(this.bloque4,"M");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                    return "invalidar";
                }else if(bloque3.getValueAt(0, 1).equals("E")){
                    CambiarValorBloqueEstado(this.bloque3,"M");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                    return "invalidar";
                }else if(bloque4.getValueAt(0, 1).equals("E")){
                    CambiarValorBloqueEstado(this.bloque4,"M");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                    return "invalidar";
                
                }else if(bloque3.getValueAt(0, 1).equals("M")){
                    mem.CambiarValorEnDir((String) this.bloque3.getValueAt(1, 1), (String) this.bloque3.getValueAt(2, 1));                    
                    CambiarValorBloqueEstado(this.bloque3,"M");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                    return "invalidar";
                }else if(bloque4.getValueAt(0, 1).equals("M")){
                    mem.CambiarValorEnDir((String) this.bloque4.getValueAt(1, 1), (String) this.bloque4.getValueAt(2, 1));                    
                    CambiarValorBloqueEstado(this.bloque4,"M");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                    return "invalidar";
                }else if(bloque3.getValueAt(0, 1).equals("O")){
                    mem.CambiarValorEnDir((String) this.bloque3.getValueAt(1, 1), (String) this.bloque3.getValueAt(2, 1));                    
                    CambiarValorBloqueEstado(this.bloque3,"M");
                    CambiarValorBloquedir(this.bloque3,dir);
                    CambiarValorBloquedat(this.bloque3,dat);
                    return "invalidar";
                }else if(bloque4.getValueAt(0, 1).equals("O")){
                    mem.CambiarValorEnDir((String) this.bloque4.getValueAt(1, 1), (String) this.bloque4.getValueAt(2, 1));                    
                    CambiarValorBloqueEstado(this.bloque4,"M");
                    CambiarValorBloquedir(this.bloque4,dir);
                    CambiarValorBloquedat(this.bloque4,dat);
                    return "invalidar";
                }
        }


    }
                    return null;

}
    
    public void CambiarDirCachewrite(String dir){
        if(bloque1.getValueAt(1, 1)!= null && bloque1.getValueAt(1, 1).equals(dir)){
            CambiarValorBloqueEstado(this.bloque1,"I");

        }else if(bloque2.getValueAt(1, 1)!= null && bloque2.getValueAt(1, 1).equals(dir)){
            CambiarValorBloqueEstado(this.bloque2,"I");
        }
        else if(bloque3.getValueAt(1, 1)!= null && bloque3.getValueAt(1, 1).equals(dir)){
            CambiarValorBloqueEstado(this.bloque3,"I");
        }else if(bloque4.getValueAt(1, 1)!= null && bloque4.getValueAt(1, 1).equals(dir)){
            CambiarValorBloqueEstado(this.bloque4,"I");

        }
        
    }
}
