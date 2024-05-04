package com.ferragnez.party;
//con questa classe verifico se l'utente viene accettato o meno alla festa. ho creato un metodo che prende il nome da verificare e 
//restituisce true se è nella lista, cosi da non dover collegare la classe allo scanner che metterò direttamente nem main.

public class SicurezzaParty {
	
	private Party party;
	
	public SicurezzaParty(Party party) {
		this.party = party;
	}
	public Boolean verificaInvitato(String nomeDaVerificare) {
		return party.accettaOspite(nomeDaVerificare);
	}

}
