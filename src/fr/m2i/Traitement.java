package fr.m2i;

public class Traitement {

    /**
     * Lance l'affichage des resultats en fonction données fournies
     * @param choix Code correspondant aux tests a appliquer au nombre
     * @param nombre Entier a tester
     */
    public Traitement(Integer choix, Integer nombre){

        switch (choix) {
            case 1: {
                testPair(nombre);
                break;
            }
            case 2: {
                testPrime(nombre);
                break;
            }
            case 3: {
                carre(nombre);
                break;
            }
            case 4: {
                testPair(nombre);
                testPrime(nombre);
                carre(nombre);
                break;
            }
            default:
                break;
        }
    }

    private void testPair(Integer nombre){
        Affichage.formatAffichage(String.format( "%d est %s",nombre,
                MathMaison.isEven(nombre)?"pair":"impair"));
    }

    private void testPrime(Integer nombre){
        Affichage.formatAffichage(String.format( "%d  %s un nombre premier",nombre,
                MathMaison.isPrime(nombre)?"est":"n'est pas"));
    }

    private void carre(Integer nombre){
        Affichage.formatAffichage(String.format( "Le carré de %d est %s",nombre,
                MathMaison.power2(nombre)!=null?MathMaison.power2(nombre)+"":"impossible a calculer"));
    }

}
