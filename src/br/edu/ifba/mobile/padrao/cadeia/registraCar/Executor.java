package br.edu.ifba.mobile.padrao.cadeia.registraCar;

public class Executor {

	public static void main(String[] args) {
		
		Setor setor = new SetorVistoria();
		setor.setProximoSetor(new SetorEmplacamento());
		setor.setProximoSetor(new SetorSeguro());
		
		System.out.println("Informação: " + setor.Exibir(TipoServico.VISTORIA).toString());

	}

}
