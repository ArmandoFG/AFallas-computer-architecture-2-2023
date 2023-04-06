/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1arqui2;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author arman
 */
public class CPU extends Thread {
    
    
    
    private instruccion instr;
    
    String numCPU;
    String instrF;
    String dirF;
    String datoF;
    String Dat;
    String Dat_pas;
    int timepoInst;
    
    boolean banderaInstr;

    //Variables Interfaz
    Interfaz ui;
    String Ejecutando;
    String Ejecutado;
    
    Random rFuncion;
    
    ModuloJTable mm;
    bus busCPU;
    memoria mem;
    
    boolean banderapasoaPaso=false;
    boolean banderaAgregarInstr=false;
    

    
    
    @Override
	public void run() {
            
            while(true){
                
                //System.out.println(ui.pausa);
                
                if(ui.pausa== false){
                    try {
                        Thread.sleep(timepoInst);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CPU.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    try {

                            if(rFuncion.Bernoulli(0.3333)==true){

                                GenerarinstrCPU();
                                this.Moesi();
                                ui.cambiartexto("-------", Ejecutando);
                                this.banderaInstr=true;

                            }

                    } catch (InterruptedException ex) {
                        Logger.getLogger(CPU.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    try {
                        if(banderapasoaPaso == true){
                            if(rFuncion.Bernoulli(0.3333)==true){

                                GenerarinstrCPU();
                                this.Moesi();
                                ui.cambiartexto("-------", Ejecutando);
                                this.banderaInstr=true;

                            }
                            banderapasoaPaso = false;
                        }else if(banderaAgregarInstr == true){
                            System.out.println("Entra:"+get_num_cpu()+" "+ui.get_instr());
                            if(this.get_num_cpu().equals(ui.get_CPU())){
                                instrF=ui.get_instr();
                                dirF=ui.get_dir();
                                datoF=ui.get_dat();
                                if(instrF.equals("WRITE")){
                                    Dat=instrF+" "+dirF+";"+datoF;
                                }else if(instrF.equals("READ")){
                                    Dat=instrF+" "+dirF;
                                }else if(instrF.equals("CALC")){

                                    Dat=instrF;
                                }
                                ui.cambiartexto(Dat, Ejecutando);
                                this.Moesi();
                                ui.cambiartexto("-------", Ejecutando);
                            }
                            banderaAgregarInstr = false;
                        }
                        Thread.sleep(1000);
                        if(ui.get_BanderaPasoApaso()==true){
                            banderapasoaPaso = true;
                            Thread.sleep(500);
                            ui.pasoApaso = false;
                        }else if(ui.get_banderaAgregarInstr()==true){
                            banderaAgregarInstr = true;
                            Thread.sleep(500);
                            ui.set_banderaAgregarInstr(false);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(CPU.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        
    CPU(String numCPU, Interfaz ui, bus busCPU, memoria mem){
        this.numCPU=numCPU;
        this.instr = new instruccion(Integer.parseInt(get_num_cpu()));
        this.instrF = "";
        this.dirF = "";
        this.datoF = "";
        timepoInst = 0;
        this.banderaInstr = false;
        this.Dat = "";
        this.Dat_pas="";
        this.ui = ui;
        this.Ejecutando = "EjecutandoCPU"+get_num_cpu();
        this.Ejecutado = "EjecutadoCPU"+get_num_cpu();
        this.busCPU = busCPU;
        this.mem =mem;
        this.rFuncion = new Random(System.currentTimeMillis()*Integer.parseInt(get_num_cpu())*1000); 
        this.mm = new ModuloJTable(ui.retornarTable("B1CPU"+get_num_cpu()),ui.retornarTable("B2CPU"+get_num_cpu()),ui.retornarTable("B3CPU"+get_num_cpu()),
                                    ui.retornarTable("B4CPU"+get_num_cpu()),mem);
        
    }
    
    public void GenerarinstrCPU() throws InterruptedException{
        
        
        Dat = instr.Construir(); 
        
        System.out.println("CPU "+get_num_cpu()+":"+Dat);
        
        ui.cambiartexto(Dat, Ejecutando);
        
        
        //System.out.print(get_num_cpu()+":"+instrF+dirF+datoF);
        
        this.instrF = instr.get_instrF();
        this.dirF = instr.get_dirF();
        this.datoF = instr.get_datoF();
        
        
        
    }
    
     public String get_instrF(){
           
           return this.instrF;
           
           
       }
       public String get_dirF(){
           
           return this.dirF;
           
           
       }
       
       public String get_datoF(){
           
           return this.datoF;
           
           
       }
       
    public String get_num_cpu(){
        return this.numCPU;
    }
    
    public void set_timepoInst(int num)
            {
                this.timepoInst = num;
                
            }
    
    public void Moesi() throws InterruptedException{
        if(this.instrF.equals("CALC")){
            
            this.Dat_pas = this.Dat;
            Thread.sleep(timepoInst);

            ui.cambiartexto(Dat_pas, Ejecutado);
            this.banderaInstr = false;
 
        } else if(this.instrF.equals("READ")){
            if(mm.buscarDirCache(dirF).equals("miss")){
                Thread HiloMiss = new Thread(new Runnable() {
                    public void run() {
                        ui.setVisibilityMissTrue(numCPU);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(CPU.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        ui.setVisibilityMissFalse(numCPU);
                    }
                });
                HiloMiss.start();
                Thread.sleep(timepoInst);
                String Valor = busCPU.preguntarReadDir(this.get_num_cpu(), this.get_dirF());
                char ultimoChar = dirF.charAt(dirF.length() - 1);
                char primerChar = Valor.charAt(0);
                String dato = Valor.substring(2, Valor.length());
                mm.IngresarDatoJTableRead(dirF, dato, String.valueOf(ultimoChar), String.valueOf(primerChar));
                this.Dat_pas = this.Dat;
                ui.cambiartexto(Dat_pas, Ejecutado);

            }
        }else if(this.instrF.equals("WRITE")){
            if(mm.buscarDirCache(dirF).equals("miss")){
                Thread HiloMiss = new Thread(new Runnable() {
                    public void run() {
                        ui.setVisibilityMissTrue(numCPU);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(CPU.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        ui.setVisibilityMissFalse(numCPU);
                    }
                });
                HiloMiss.start();
            }
            Thread.sleep(timepoInst);
            char ultimoChar = dirF.charAt(dirF.length() - 1);
            String accion = mm.IngresarDatoJTableWrite(dirF, datoF, String.valueOf(ultimoChar));
            if(accion.equals("invalidar")){
                busCPU.invalidarDirWrite(this.get_num_cpu(), dirF);
            }
        }
        this.Dat_pas = this.Dat;
        ui.cambiartexto(Dat_pas, Ejecutado);
    }
    
    
    
}
