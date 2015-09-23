/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author 31410324
 */
public class Pessoa {

    private double peso;
    private double altura;
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa() {
        this.peso = 0.0;
        this.altura = 0.0;
        this.nome = "";
        this.idade = 0;
        this.sexo = "";
    }

    public Pessoa(double peso, double altura, String nome, int idade, String sexo) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public double calculaIMC() {

        double imc = 0;

        imc = peso / (altura * altura);

        return imc;
    }

    public String checaIMC(double imc) {
        if (imc < 18.5) {
            return ("Você está abaixo do peso recomendado");
        } else if ((imc >= 18.5) && (imc < 25)) {
            return ("Você está muito bem continue assim");
        } else if ((imc >= 25) && (imc < 30)) {
            return ("Você está acima do peso recomendado.Cuidado!");
        } else {
            return ("Você está obeso.Procure o acompanhamento de um nutriconista e realizar mais atividades físícas!");
        }
    }



    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
