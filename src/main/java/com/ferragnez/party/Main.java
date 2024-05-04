package com.ferragnez.party;

import java.util.Scanner;

//tramite la classe Scanner faccio inserire all'utente il suo nome, cosi da poterlo verificare grazie ai metodi che ho creato
//nelle classi che devo istanziare. infine stampo un messaggio positivo se la persona è invitata e uno negativo se non lo è.

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome: ");
	
		String nomeDaVerificare = scan.nextLine();
		scan.close();
		
		//istanzio le due classi
		Party party = new Party();
		SicurezzaParty sicurezzaParty = new SicurezzaParty(party);
		boolean invitato = sicurezzaParty.verificaInvitato(nomeDaVerificare);
		
		if(invitato) {
			System.out.println("Benvenuto " + nomeDaVerificare + " alla meravigliosa festa dei Ferragnez " + " !!");
		} else {System.out.println("Mi dispiace " + nomeDaVerificare + " non ti si fila nessuno" + " non sei invitato !");
		
		}

	}

}
