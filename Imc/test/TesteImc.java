/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import imc.Pessoa;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author -Giovanni
 */
public class TesteImc {
    @Test
    public void TesteConstrutorPadraoImc() {
        Pessoa p = new Pessoa();
        Assert.assertEquals(0.0, p.getPeso(), 0.01);
        Assert.assertEquals(0.0, p.getAltura(), 0.01);
        Assert.assertEquals("", p.getNome());
        Assert.assertEquals(0, p.getIdade());
        Assert.assertEquals("", p.getSexo());

    }
    @Test
    public void TesteConstrutorNaoPadrao() {
        Pessoa p1 = new Pessoa(90.0, 1.89, "Giovanni", 21, "Masculino");
        Assert.assertEquals(90.0, p1.getPeso(), 0.01);
        Assert.assertEquals(1.89, p1.getAltura(), 0.01);
        Assert.assertEquals("Giovanni", p1.getNome());
        Assert.assertEquals(21, p1.getIdade());
        Assert.assertEquals("Masculino", p1.getSexo());

    }
    
    @Test
    public void TesteCalculaImc(){
        Pessoa p1 = new Pessoa(90.0, 1.89, "Giovanni", 21, "Masculino");
        Assert.assertEquals(25.19, p1.calculaIMC(),0.01);
    }
    
    @Test
    public void TesteChecaImc(){
        Pessoa p1 = new Pessoa(90.0, 1.89, "Giovanni", 21, "Masculino");
        Pessoa p2 = new Pessoa(130.0, 1.89, "Giovanni", 21, "Masculino");
        Pessoa p3 = new Pessoa(70.0, 1.89, "Giovanni", 21, "Masculino");
        Pessoa p4 = new Pessoa(20.0, 1.89, "Giovanni", 21, "Masculino");
        Assert.assertEquals("Você está acima do peso recomendado.Cuidado!",p1.checaIMC(p1.calculaIMC()));
        Assert.assertEquals("Você está obeso.Procure o acompanhamento de um nutriconista e realizar mais atividades físícas!",p2.checaIMC(p2.calculaIMC()));
        Assert.assertEquals("Você está muito bem continue assim",p3.checaIMC(p3.calculaIMC()));
        Assert.assertEquals("Você está abaixo do peso recomendado",p4.checaIMC(p4.calculaIMC()));
    }
    
    
    

    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
