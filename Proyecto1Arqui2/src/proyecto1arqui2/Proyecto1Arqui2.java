
package proyecto1arqui2;

/**
 *
 * @author arman
 */
public class Proyecto1Arqui2 {
    
    static int TiempoDuración = 3000;
    static bus busCPU;
    static memoria mem;
    static CPU cpu1;
    static CPU cpu2;
    static CPU cpu3;
    static CPU cpu4;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Interfaz ui;
        
        
        
        
        ui = new Interfaz();
        ui.setVisible(true);
         
        mem= new memoria(ui);
        
        busCPU = new bus(mem);
        
        cpu1= new CPU("1",ui,busCPU,mem);
        cpu1.set_timepoInst(TiempoDuración);
        cpu2= new CPU("2",ui,busCPU,mem);
        cpu2.set_timepoInst(TiempoDuración);
        cpu3= new CPU("3",ui,busCPU,mem);
        cpu3.set_timepoInst(TiempoDuración);
        cpu4= new CPU("4",ui,busCPU,mem);
        cpu4.set_timepoInst(TiempoDuración);
        
        
        busCPU.set_cpu1(cpu1);
        busCPU.set_cpu2(cpu2);
        busCPU.set_cpu3(cpu3);
        busCPU.set_cpu4(cpu4);

  
        
        
        cpu1.start();
        cpu2.start();
        
        /*
        cpu3.start();
        cpu4.start();
      */
        
        
    }
    
}
