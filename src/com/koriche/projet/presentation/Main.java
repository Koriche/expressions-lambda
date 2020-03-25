package com.koriche.projet.presentation;

import com.koriche.projet.metier.Personne;
import com.koriche.projet.service.IJeu;

public class Main {

	public static void main(String[] args) {
		// Première version
		Personne p = new Personne();
		p.jouer(new IJeu() {

			@Override
			public void jouer() {
				System.out.println("je joue");
			}
			
		});
		
		// Deuxième version
		
		p.jouer(() -> System.out.println("Je joue test"));
	}
}
