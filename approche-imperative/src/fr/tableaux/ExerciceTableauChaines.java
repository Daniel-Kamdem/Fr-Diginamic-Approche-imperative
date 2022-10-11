package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {
	
	public static void main(String[] args) {
		
	String[] ville = { "paris", "marseille", " lyon", "toulouse", "nice" }; 
	
	System.out.println(ville);
		
	System.out.println(Arrays.toString(ville));
	ville[2] = "Reims"; 
	
	System.out.println(ville.length);
	
	System.out.println(Arrays.toString(ville));
	
	
	}

}
