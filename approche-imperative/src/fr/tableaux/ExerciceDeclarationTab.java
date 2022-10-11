package fr.tableaux;

import java.util.Arrays;

public class ExerciceDeclarationTab { 
	public static void main(String[] args) {
		
		int[] tableaux = { 8, -7, 12, 1, -2, 14, 17, 9 };
		
System.out.println(tableaux [0]);
		
		System.out.println(tableaux.length);
		
		System.out.println(tableaux[7]);
		
		System.out.println(tableaux[tableaux.length -1]);
		
		System.out.println(tableaux[8]); 
		
		System.out.println(Arrays.toString(tableaux));
		// elle affiche erreur car le tableau afficher ci-dessus n'a pas d'index 10 
	}
}
