package com.mycompany.atvd;

public class Vendedor extends Funcionario{
    private EquipeVendas equipe;
    
    @Override
    public float getSalario(int horas){
        return (horas*50);
    }
    public float getSalario(int horas, boolean bonus){
         if(bonus == true){
             return (horas*50)*1.10f;
         }
         
             return horas*50;
    }

    public EquipeVendas getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipeVendas equipe) {
        this.equipe = equipe;
    }
    
    
   
}
