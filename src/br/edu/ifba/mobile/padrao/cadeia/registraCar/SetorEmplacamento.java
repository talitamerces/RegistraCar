package br.edu.ifba.mobile.padrao.cadeia.registraCar;

public class SetorEmplacamento extends Setor{
	//inst�ncia das infroma��es para o atendimento do setor de emplacamento
		private Informe informacao = new Informe("10:00 �s 18:00", "Simone Suan", "Sala 1A");
		
		public Informe Exibir(TipoServico servico) {
			if (servico == TipoServico.EMPLACAMENTO) {
				return informacao;
			}
			return proximo.Exibir(servico);
		}
}
