package Progetto;

public class Test {

	public static void main(String[] args) {

		Bando bando1 = new Bando();
		bando1.Autore="Curatore/Comune";
		bando1.Titolo="Bando per sportelli postali";
		bando1.Descrizione="Selezione di 50 dipendenti per l'ufficio...";
		bando1.Scadenza="31/04/2024";
		
		System.out.println(bando1.Autore+" - "+bando1.Titolo);
		System.out.println(bando1.Descrizione);
		System.out.println("Scadenza: "+bando1.Scadenza);
		
		System.out.println();

		bando1.processaDocumento();
		bando1.processaDocumento();
		bando1.processaDocumento();
		bando1.processaDocumento();
		
		System.out.println();
		System.out.println();

		Evento evento2 = new Evento();
		evento2.Autore="Contributors Autorizzato/ProLoco";
		evento2.Titolo="Festa del folklore";
		evento2.Data="25/07/2024";
		evento2.Luogo="Piazza Enrico Mattei";
		evento2.Descrizione="Festa con balli popolari, degustazioni tipiche...";
		
		System.out.println(evento2.Autore+" - "+evento2.Titolo);
		System.out.println("Data: "+evento2.Data);
		System.out.println("Luogo: "+evento2.Luogo);
		System.out.println(evento2.Descrizione);
		
		System.out.println();

		evento2.processaDocumento();
		evento2.processaDocumento();
		evento2.processaDocumento();
		
		System.out.println();
		System.out.println();

		News news3 = new News();
		news3.Autore="Contributors/Cosmari";
		news3.Titolo="Modifiche ai giorni per la raccolta differenziata";
		news3.Descrizione="Per cause legate al maltempo, la raccolta ...";
		
		System.out.println(news3.Autore+" - "+news3.Titolo);
		System.out.println(news3.Descrizione);
		
		System.out.println();

		news3.processaDocumento();
		news3.processaDocumento();
				
		System.out.println();
		System.out.println();

		Itinerario iti4 = new Itinerario();
		iti4.Autore="Turista/Marco Rossi";
		iti4.Titolo="Per le vie di Braccano";
		iti4.Partenza="Matelica";
		iti4.Destinazione="Braccano";
		iti4.Descrizione="Giro per le meraviglie turistiche della città...";
		
		System.out.println(iti4.Autore+" - "+iti4.Titolo);
		System.out.println("Partenza da: "+iti4.Partenza);		
		System.out.println("Arrivo a: "+iti4.Destinazione);
		System.out.println(iti4.Descrizione);
		
		System.out.println();

		iti4.processaDocumento();
	}

}
