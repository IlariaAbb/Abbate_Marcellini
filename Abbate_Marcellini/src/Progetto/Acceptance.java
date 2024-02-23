package Progetto;

public class Acceptance implements ProcessaDocumento {
	public void processaDocumento(Documento documento) {
		System.out.println("Stato: In fase di pubblicazione");
		documento.setState(new Published());
	}
}