package com.unicam;

public class UploadedFile implements ProcessaDocumento {
	public void processaDocumento(Documento documento) {
		System.out.println("Stato: Documento correttamente caricato");
		documento.setState(new Pending());
	}
}