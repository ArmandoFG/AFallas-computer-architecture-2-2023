/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1arqui2;
import java.util.Stack;

/**
 *
 * @author arman
 */
public class bus {
    
    Stack<String> oper = new Stack<String>();
    Stack<String> dir = new Stack<String>();
    Stack<String> dato = new Stack<String>();
    
    CPU cpu1;
    CPU cpu2;
    CPU cpu3;
    CPU cpu4;
    memoria mem;
    
    
    bus(memoria mem){
        
        this.mem = mem;
        this.cpu1 = null;
        this.cpu2 = null; 
        this.cpu3 = null;
        this.cpu4 = null;
    }
    
    public void ingresarInstrbus(String operacion, String Direccion, String Dato){
        
        if(operacion.equals("CALC")){
            oper.add(operacion);
        }else if(operacion.equals("READ")){
            oper.add(operacion);
            dir.add(Direccion);
        }else if(operacion.equals("WRITE")){
            oper.add(operacion);
            dir.add(Direccion);
            dato.add(Dato);
            
        }
        
    }
    
    public String preguntarReadDir(String cpu, String dir){
        if(!cpu1.get_num_cpu().equals(cpu)){
            String r1 = cpu1.mm.buscarDirCache(dir);
            if(!r1.equals("miss")){
                String valor = cpu1.mm.retornarValorCacheRead(r1);
                return "c:"+valor;
            }
        }else if(!cpu2.get_num_cpu().equals(cpu)){
            String r1 = cpu2.mm.buscarDirCache(dir);
            if(!r1.equals("miss")){
                String valor = cpu2.mm.retornarValorCacheRead(r1);
                return "c:"+valor;
            }
        }else if(!cpu3.get_num_cpu().equals(cpu)){
            String r1 = cpu3.mm.buscarDirCache(dir);
            if(!r1.equals("miss")){
                String valor = cpu3.mm.retornarValorCacheRead(r1);
                return "c:"+valor;
            }
        }else if(!cpu4.get_num_cpu().equals(cpu)){
            String r1 = cpu4.mm.buscarDirCache(dir);
            if(!r1.equals("miss")){
                String valor = cpu4.mm.retornarValorCacheRead(r1);
                return "c:"+valor;
            }
        }
        
        return mem.BuscarDir(dir);
    }
    public void set_cpu1(CPU cpu){
        this.cpu1=cpu;
    }
    public void set_cpu2(CPU cpu){
        this.cpu2=cpu;
    }
    public void set_cpu3(CPU cpu){
        this.cpu3=cpu;
    }
    public void set_cpu4(CPU cpu){
        this.cpu4=cpu;
    }
    
    
}
