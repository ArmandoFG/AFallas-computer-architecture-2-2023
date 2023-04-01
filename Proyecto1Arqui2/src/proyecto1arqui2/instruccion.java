/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1arqui2;

/**
 *
 * @author arman
 */
public class instruccion {
    
       String tipo[] = {"CALC","READ","WRITE"};
       Random rFuncion = new Random();
       
       
       public String Construir(){
           
           String instr="";
           
           instr = GenerarTipo();
           
           
           
           if(instr.equals("READ")){
               instr = instr +" "+ GenerarDir();
               return instr;
           }else if(instr.equals("WRITE")){
               instr = instr +" "+ GenerarDir() +";"+GenerarDato();
               return instr;
           }else{
                   return instr;
                   }
       }
       
       private String GenerarDir(){
           
           String dir = "";
           

           
           for (int i = 0; i < 3; i++) {
               
               if(rFuncion.Bernoulli(0.5)==true){
                   dir=dir+"1";
               }else{
                   dir=dir+"0";
               }
        }
           
           
           return dir;
           
       }
       
       private String GenerarTipo(){
           
           String tip = "";
           int i = 0;
           
           while(rFuncion.Bernoulli(0.3333)==false){
               if (i == 2){
                   i=0;
               }else{
                   i++;
               }
           }
           
           tip = tipo[i];
           
           return tip;
           
       }
    
       public String GenerarDato(){
           String dato="";
           
           for (int i = 0; i < 16; i++) {
               
               if(rFuncion.Bernoulli(0.5)==true){
                   dato=dato+"1";
               }else{
                   dato=dato+"0";
               }
        }
           
           System.out.println(dato);
           return binarioAHex(dato);
       }
       
       private static String binarioAHex(String binario) {
            int decimal = Integer.parseInt(binario, 2); // Convertir de binario a decimal
            String hexadecimal = Integer.toHexString(decimal); // Convertir de decimal a hexadecimal
            return hexadecimal;
        }
}

    
