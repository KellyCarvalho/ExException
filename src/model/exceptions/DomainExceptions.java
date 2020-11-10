package model.exceptions;

import java.util.Arrays;

public class DomainExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;
	String mensagem;
	
	public DomainExceptions(String mensagem) {
		this.mensagem=mensagem;
		
	}

	@Override
	public String toString() {
		return mensagem.toString();
	}


	

}
