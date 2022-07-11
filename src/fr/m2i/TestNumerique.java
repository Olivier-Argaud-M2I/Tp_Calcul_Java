package fr.m2i;

public class TestNumerique {

    /**
     * Gere un cycle complet de test de valeur numerique
     */
    public TestNumerique() {
        // on instancie un nouvel objet de saisie console
        SaisieConsole saisie = new SaisieConsole();
        Integer nombre = null;
        Integer choix = null;

        // on appel l'affichage pour poser la premiere question
        Affichage.formatLigne("veuillez saisir le nombre a tester : ");
        // on appel la method entier() de notre instance saisie jusqu'a avoir une saisie valide
        while(nombre==null){
            nombre = saisie.entier();
        }
        // on affiche le nombre saisie
        Affichage.formatAffichage("Votre choix : "+nombre);
        // on affiche le menu de selection
        Affichage.afficheMenuSelection();
        // on appel la method entier() de notre instance saisie jusqu'a avoir une saisie valide
        while(choix==null || choix<1 || choix>5){
            choix = saisie.entier();
            if(choix==null || choix<1 || choix>5){
                Affichage.formatLigne("saisie non valide ( entre 1 et 4 )");
            }
        }
        // on affiche le nombre saisie
        Affichage.formatAffichage("Votre choix : "+choix);
        // on lance le traitement avec les information receuillies
        new Traitement(choix,nombre);

    }

}





