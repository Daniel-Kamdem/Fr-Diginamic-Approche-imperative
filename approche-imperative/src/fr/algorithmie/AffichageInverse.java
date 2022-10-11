package fr.algorithmie;

import java.util.Arrays;
import java.util.Collections;

public class AffichageInverse {

	public static void main(String[] args) {
		
		// afficher toutes les valeurs du tableaux 
		
		int [] array  = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14,-4};
		
		int longarray = array.length;
	
// Utiliser un boucle pour afficher  l'ensemble des valeurs du tableau

	for (int i = 0; i < array.length; i++) {

		
		System.out.print(array [i] + ",");
	
	}
	System.out.println( );
	for (int i = longarray - 1; i >= 0; i--) {
		System.out.print(array[i] + " ");
	}
	
	// Créer un tableau arrayCopy et copier tous les éléments de array dansarrayCopy
			System.out.println();
	int[] arrayCopy = new int[array.length];
			
	for (int i = 0; i < longarray; i++) {
				arrayCopy[i] = array[i];
}
}
}
	// Afficher les elements du tableau à l'ordre inverse 
	
	


