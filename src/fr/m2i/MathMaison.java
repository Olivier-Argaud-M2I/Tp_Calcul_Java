package fr.m2i;

public class MathMaison {


    /**
     * Test si le nombre fourni en parametre est un nombre primaire
     * @param number nombre entier a tester
     * @return true si le nombre est un nombre primaire sinon false
     */
    public static Boolean isPrime(int number)
    {

        if (number < 2)
        {
            return false;
        }
        if (number == 2)
        {
            return true;
        }
        if (number % 2 == 0)
        {
            return false;
        }

        for (int i = number - 2; i > 2; i -= 2)
        {
            if (number % i == 0)
            {
                return false;
            }
        }
        return true;
    }


    /**
     * Test si le nombre fourni est pair
     * @param number Nombre entier a tester
     * @return true si le nombre est pair sinon false
     */
    public static Boolean isEven(int number)
    {
        return number % 2 == 0;
    }


    /**
     * Calcul le carré d'un nombre entier ( max: 46340 min: -46340)
     * @param number nombre entier dont on souhaite le carré
     * @return  le carré du nombre fourni ou null si on exede le maximum
     */
    public static Integer power2(Integer number)
    {
        if( number > -46340 && number< 46340){
            return number * number;
        }
        return null;
    }

}
