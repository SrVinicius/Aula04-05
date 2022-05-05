package com.mycompany.atvd;
public class Gerente extends Funcionario{
    @Override
   public float getSalario(int horas){
       return (horas*50);
   }
   
   public float getSalario(int horas, boolean meta){
       if(meta == true){
            return (horas*50)*1.20f;
         }
         
             return horas*50;
   }
           
}
