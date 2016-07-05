package helloworld;

import java.io.IOException;

public class MasterMind {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mm2 un_master ;
		int[] resultat ;
		boolean fini = false ;
		char clavier ;
		
		try {
			un_master = new Mm2() ;
			un_master.OrdiJoue();
			un_master.JoueurJoue();
			resultat = un_master.ResultatJeu();
			
			while (!fini) {
				System.out.println( "bien placé:" + resultat[0] + "; couleurs trouvées:" + resultat[1] );
	
				System.out.println( "c: continue; espace : fin") ;
				clavier = (char) System.in.read() ;
				if (clavier == ' ' ) fini = true;
				System.out.println("car=" + clavier );
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


