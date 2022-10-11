package fr.boucles;

import java.util.Arrays;

public class ExerciceTableauEntier {

	public static void main(String[] args) {

		int[] tableaux = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	
		
		System.out.println(tableaux[0]);

		System.out.println(tableaux.length);

		System.out.println(tableaux[tableaux.length - 1]);

		tableaux[3] = 8;

		System.out.println(tableaux[3]);

	}
}
