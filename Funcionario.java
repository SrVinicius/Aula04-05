
package com.mycompany.atvd;

public abstract class Funcionario{
    private String nome;
    private String nascimento;
    private String cpf;
    private Endereco endereco;


    public Funcionario(){
        
    }
    
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public abstract float getSalario(int horas);
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
