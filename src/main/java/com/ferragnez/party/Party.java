package com.ferragnez.party;

//creo l'attributo della lista degli invitati, dopo attraverso il costruttore creo l'array con i nomi degli invitati, 
//mi serve un ciclo for per scorrere tutta la lista invitati e infine un metodo per stamparli in console.
//Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax,  Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, 
//Rachel Zeilic

public class Party {
	
	private String[] listaInvitati;
	
	public Party() {
		this.listaInvitati = new String[] {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
	}
	
	public String[] getListaInvitati() {
		return listaInvitati;
	}
		
		public Boolean accettaOspite(String nomeDaVerificare) {
			for(int i = 0; i < listaInvitati.length; i++) {
				if (listaInvitati[i].equalsIgnoreCase(nomeDaVerificare)) {
					return true; //se trova l'ospite
				}
				
			}
		return false; //se non trova l'0spite
	} 
		
	
}
