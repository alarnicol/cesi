package helloworld;
import java.util.Scanner;
import java.util.Arrays;

public class Mm2 {

	private int listeOrdi [];
	private int listeJoueur[];
	private char listeCouleur[];
	
	public  Mm2() {
		this.listeCouleur = new char[6];

		this.listeCouleur[0] = 'R' ;
		this.listeCouleur[1] = 'B' ;
		this.listeCouleur[2] = 'J' ;
		this.listeCouleur[3] = 'V' ;
		this.listeCouleur[4] = 'N' ;
		this.listeCouleur[5] = 'G' ;	

		// init listeOrdi
		this.listeOrdi = new int[4];
		
		// init liste joueur
		this.listeJoueur = new int[4];		
	}
	
	private int[] convertiCouleur( int[] parListe )
	{
		int[] retour ;
		int lgListe = 0 ;
		
		lgListe = parListe.length ;
		retour = new int[lgListe] ;
		
		return retour ;
		
	}
	
	private void  RempliListeOrdi()
	{		
		this.listeOrdi[0] = 1;
		this.listeOrdi[1] = 5;
		this.listeOrdi[2] = 2;
		this.listeOrdi[3] = 0;
	}

	private void  RempliListeJoueur()
	{		
		int nb;
		char carac ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir 4 couleurs (1er lettre) parmis : Rouge Bleu Jaune Vert Noir Gris");
		String str = sc.nextLine();
		
		for (int i=0; i<4; i++){
			for (int j=0; j<6; j++){
				carac = str.charAt(i);
				if ( carac == this.listeCouleur[j] ) this.listeJoueur[i] = j;
		
			}
		}
	}
	
	private void RempliListeJoueur_old()
	{
		this.listeJoueur[0] = 0;
		this.listeJoueur[1] = 5;
		this.listeJoueur[2] = 2;
		this.listeJoueur[3] = 1;
	}
	
	private int[] compareListes()
	{
		 int[] retour ;
		 int i, j ;
		 int nbDedans = 0, nbBonnePlace = 0 ;
		 
		 retour = new int[2];
		 retour[0] = 0 ; // nb bonne place
		 retour[1] = 0 ; // nb dedans

		//affiche choix joueur
		System.out.println("Vous avez saisi : " + Arrays.toString(listeJoueur));
		
		//affiche choix machine
		System.out.println("choix machine : " + Arrays.toString(listeOrdi));
		
		 for (i=0; i<4; i++ )
		 {
			for (j=0; j<4; j++)
			{
				if ( this.listeJoueur[i] == this.listeOrdi[j] )
				{
					nbDedans ++ ;
					if ( i == j ) nbBonnePlace ++ ;
				}
			}
		 }
		 
		 retour[0] = nbBonnePlace ;
		 retour[1] = nbDedans ;
		 
		 return retour ; 
	}

	public int[] ResultatJeu() {
		
		return this.compareListes() ;
	}
	
	public void OrdiJoue() {
		
		this.RempliListeOrdi();
	}
	
	public void JoueurJoue() {

		this.RempliListeJoueur();
	}
}


