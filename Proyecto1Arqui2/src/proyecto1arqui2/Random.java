/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1arqui2;

/**
 *
 * @author arman
 */
public class Random {
    
    //private double semilla=12345.6789;
    
    private double semilla;
    
    Random(double sem){
        this.semilla = sem;
    }
    
    public Boolean Bernoulli(double p){
        
        double ri = generarAleatorio();
        
        if (ri <= p){
            return true;
        }else{
            return false;
        }
        
        
    }
    
    
    public double generarAleatorio() {
        
        double a = 16807;
        double m = (2^31)-1;
        
        double aleatorio=0;
       
        //System.out.println("Semilla: " + semilla);
        aleatorio = (a * semilla) % m;
        aleatorio=aleatorio/m;
        
        semilla = aleatorio; // Actualizar la semilla para la siguiente iteración

        
        //System.out.println("Aleatorio: " + aleatorio);
        
        return aleatorio;
        
    }
    
    
    
}
