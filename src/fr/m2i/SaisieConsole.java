package fr.m2i;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaisieConsole {

    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

    public SaisieConsole(){

    }

    /**
     *
     * @return l'entier saisie ou null si la saisie n'est pas valide
     */
    public Integer entier(){
        try
        {
            return  Integer.parseInt(buff.readLine());
        }
        catch (NumberFormatException e)
        {
            Affichage.formatLigne("Veuillez saisir un nombre entre -2 147 483 648 et 2 147 483 647");
        }
        catch (IOException e){
            Affichage.formatLigne("Erreur entrée");
        }
        return null;
    }

    /**
     *
     * @return un Character ou null si la saisie n'est pas valide
     */
    public Character YesOrNo(){
        try
        {
            return  buff.readLine().charAt(0);
        }
        catch (IOException e){
            Affichage.formatLigne("Erreur entrée");
        }
        return null;
    }

}
