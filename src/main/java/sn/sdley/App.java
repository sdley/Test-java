package sn.sdley;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculatrice calculatrice = new Calculatrice();
        int som = calculatrice.addition(4, 5);
        System.out.println("La somme 4 + 5 est : " + som);
    }
}
