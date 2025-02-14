package sn.sdley;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatriceTest {
    Calculatrice calculatrice; // attribut

    @Before
    public void instance(){
        calculatrice = new Calculatrice();
    }

    @After
    public void apres(){
        calculatrice = null; // apres, on tue l'instance !
    }

    @Test
    public void additionTest() {
        int som = calculatrice.addition(2, 3);
        assertEquals(5, som);
    }

    @Test
    public void additionBooleanTest(){
        int som = calculatrice.addition(2, 3); // 5
        boolean result = som == 5;
        Assert.assertTrue(result);
    }

    @Test
    public void soustractionTest() {
        int som = calculatrice.soustraction(3, 2);
        assertEquals(1, som);
    }

    @Test
    public void multiplicationTest() {
        int som = calculatrice.multiplication(3, 2);
        assertEquals(6, som);
    }

    @Test
    public void divisionTest() {
        int som = calculatrice.division(6, 2);
        assertEquals(3, som);
    }

    @Test
    public void additionValeurNegativeParTry()
    {
        try{
            calculatrice.addition(-1, 4);
            fail("l'addition ne marche pas");
        }catch (ArithmeticException exception){
            assertEquals("numerande negative", exception.getMessage());
        }
    }

    @Test
    public void additionValeurNegativeParAssertThrows(){
//        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculatrice.addition(-1, 5));
//        assertEquals("numerande negative", exception.getMessage());

        assertThrows("numerande negative", ArithmeticException.class, () -> calculatrice.addition(-1, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void additionValeurNegativeParAnnotation(){
        calculatrice.addition(-1, 5);
    }


    // ecrire les methodes de tests de division et gerer la division par 0

    @Test
    public void divisionParZeroParTry() {
        try {
            calculatrice.division(10, 0);
            fail("La division par zéro doit lever une exception");
        } catch (ArithmeticException exception) {
            assertEquals("division par zero", exception.getMessage());
        }
    }

    @Test
    public void divisionParZeroParAssertThrows() {
        assertThrows("division par zero", ArithmeticException.class, () ->
                calculatrice.division(10, 0));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionParZeroParAnnotation() {
        calculatrice.division(10, 0);
    }



}
