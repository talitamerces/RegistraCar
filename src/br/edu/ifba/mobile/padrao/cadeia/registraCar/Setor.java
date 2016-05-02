package br.edu.ifba.mobile.padrao.cadeia.registraCar;

public abstract class Setor {

	protected Setor proximo = null;
	
	public void setProximoSetor(Setor proximo){
		if(this.proximo != null){
			this.proximo.setProximoSetor(proximo);
		}else{
			this.proximo = proximo;
		}
	}
	
	
	
}
