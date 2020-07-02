package br.com.impacta.exercicios.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.exercicios.classes.Imovel;
import br.com.impacta.exercicios.info.Info;

public class AplicacaoImovel {
	public static void main(String[] args) {
		
		Imovel imovel;
		String opcao = (String)JOptionPane.showInputDialog(
									null,
									"Selecione uma opção",
									"Seleção de imovel",
									JOptionPane.DEFAULT_OPTION,
									null,
									new String[]{"Venda","Locacao"},
									"Venda");
		
		if(opcao.equalsIgnoreCase("venda")){
			double valor = Double.parseDouble(
					JOptionPane.showInputDialog("Valor do imóvel:"));

			double desconto = Double.parseDouble(
					JOptionPane.showInputDialog("Valor do desconto:"));
			
			imovel = Info.criarImovelVenda(valor, desconto);
		}
		else {
			imovel = Info.criarImovelLocacao(500, 10);
		}
		JOptionPane.showMessageDialog(null, imovel.getDados());
			
	}
}
