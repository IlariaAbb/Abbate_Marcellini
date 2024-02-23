package Progetto;

public class Pending implements ProcessaDocumento {
	public void processaDocumento(Documento documento) {
		System.out.println("Stato: In attesa di verifica");
		documento.setState(new Acceptance());
	}
}