package sn.sdley;

import org.junit.Assert;
import org.junit.Test;

public class CalculatriceTest {

    @Test
    public void additionTest() {
        Calculatrice calculatrice = new Calculatrice();
        int som = calculatrice.addition(2, 3);
        Assert.assertEquals(5, som);
    }

    @Test
    public void additionBooleanTest(){
        Calculatrice calculatrice = new Calculatrice();
        int som = calculatrice.addition(2, 3); // 5
        boolean result = som == 5;
        Assert.assertTrue(result);
    }

    @Test
    public void soustractionTest() {
        Calculatrice calculatrice = new Calculatrice();
        int som = calculatrice.soustraction(3, 2);
        Assert.assertEquals(1, som);
    }

    @Test
    public void multiplicationTest() {
        Calculatrice calculatrice = new Calculatrice();
        int som = calculatrice.multiplication(3, 2);
        Assert.assertEquals(6, som);
    }

    @Test
    public void divisionTest() {
        Calculatrice calculatrice = new Calculatrice();
        int som = calculatrice.division(6, 2);
        Assert.assertEquals(3, som);
    }



}
