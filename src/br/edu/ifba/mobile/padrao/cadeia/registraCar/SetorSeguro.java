package br.edu.ifba.mobile.padrao.cadeia.registraCar;

public class SetorSeguro {

	//inst�ncia das infroma��es para o atendimento do setor de seguro automotivo
		private Informe informacao = new Informe("10:00 �s 17:00", "Lorena Assion", "Sala 3A");
		
		public Informe Exibir(TipoServico servico) {
			if (servico == TipoServico.SEGURO_AUTOMOTIVO) {
				return informacao;
			}
			return null;
		}
	
}
