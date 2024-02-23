package com.unicam;

public abstract class Documento implements ProcessaDocumento{
	
	public void create() {
	}
	
	private ProcessaDocumento currentState;
	
	public Documento() {
		this.currentState = new UploadedFile();
	}
	
	public void setState(ProcessaDocumento state) {
		this.currentState = state;
	}
	
	public void processaDocumento() {
		if (currentState != null ) {
			currentState.processaDocumento(this);
		}
	}
}
