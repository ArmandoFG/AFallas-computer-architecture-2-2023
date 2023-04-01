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
       Random rFuncion;
       String instrF;
       String dirF;
       String datoF;


       
       
       instruccion(int num_proc)
               {
                   this.rFuncion = new Random(System.currentTimeMillis()*num_proc*1000); 
                   this.instrF = "";
                   this.dirF = "";
                   this.datoF = "";
                   
                   
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
       
       
       public String Construir(){
           
           String instr="";
           
           this.instrF = GenerarTipo();
           this.dirF = GenerarDir();
           this.datoF = GenerarDato();
           
           
           
           if(instrF.equals("READ")){
              // datoF = "";
               instr = instrF +" "+ dirF;
               return instr;
           }else if(instrF.equals("WRITE")){
               instr = instrF +" "+ dirF +";"+datoF;
               return instr;
           }else{
                   //dirF="";
                   //datoF="";
                   return instrF;
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
           
           return binarioAHex(dato);
       }
       
       private static String binarioAHex(String binario) {
            int decimal = Integer.parseInt(binario, 2); // Convertir de binario a decimal
            String hexadecimal = Integer.toHexString(decimal); // Convertir de decimal a hexadecimal
            return hexadecimal;
        }
}

    
