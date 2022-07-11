package fr.m2i;



public class Affichage {


    public static void afficheMenuSelection(){
        separateur();
        System.out.println(String.format( "/                        Choissez une option :                        /"));
        System.out.println(String.format( "/                1 : tester si le nombre est pair                     /"));
        System.out.println(String.format( "/                2 : tester si le nombre est primaire                 /"));
        System.out.println(String.format( "/                3 : calculer la puissance de deux                    /"));
        System.out.println(String.format( "/                4 : tout                                             /"));
    }

    /**
     * affiche un separateur dans la console
     */
    public static void separateur(){
        System.out.println(String.format( "/*********************************************************************/"));
    }

    /**
     * affiche un espace dans la console
     */
    public static void espace(){
        System.out.println(String.format( "/                                                                     /"));
    }

    /**
     * Met en forme le text passé en parametre avec seprateur et saut de ligne
     * @param message String a mettre en forme
     */
    public static void formatAffichage(String message){
        separateur();
        espace();
        formatLigne(message);
        espace();
    }

    /**
     *  Met en forme sur une ligne le message passsé en parametre
     * @param message String a mettre en forme
     */
    public static void formatLigne(String message ){
        System.out.println("/   "+String.format("%-66s",message) + "/");
    }


}
