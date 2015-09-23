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
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setPeso(225.3);
        p1.setAltura(1.88);
        
        System.out.println(p1.checaIMC(p1.calculaIMC()));
    }
    
}
