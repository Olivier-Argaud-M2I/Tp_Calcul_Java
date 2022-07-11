package fr.m2i;

public class MainTp
{

	public static void main(String[] args)
	{
		SaisieConsole saisieConsole = new SaisieConsole();
		Character response = null;

		while(response==null || response !='n'){
			new TestNumerique();
			Affichage.formatAffichage("Voulez vous recommencer y/n");
			response = saisieConsole.YesOrNo();
		}

		Affichage.separateur();




	}

}
