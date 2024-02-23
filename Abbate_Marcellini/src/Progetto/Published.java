package Progetto;
import java.time.LocalDate;

public class Published implements ProcessaDocumento{
	public void processaDocumento(Documento documento) {
		System.out.println("Stato: Pubblicato il "+LocalDate.now());
		documento.setState(null);
	}
}