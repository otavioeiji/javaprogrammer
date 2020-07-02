package br.com.impacta.exercicios.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.exercicios.classes.Imovel;
import br.com.impacta.exercicios.info.Info;

public class AplicacaoImovel {
	public static void main(String[] args) {
		
		Imovel imovel = Info.criarImovel();		
		JOptionPane.showMessageDialog(null, imovel.getDados());		
	}
}
