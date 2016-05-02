package br.edu.ifba.mobile.padrao.cadeia.registraCar;

public abstract class Setor {

	// instanciando objeto
	protected Setor proximo = null;

	// método
	public void setProximoSetor(Setor proximo) {
		if (this.proximo != null) {
			this.proximo.setProximoSetor(proximo);
		} else {
			this.proximo = proximo;
		}

	}

	public abstract String Agendar(TipoSetor duvida);

}
