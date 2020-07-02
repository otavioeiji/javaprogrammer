package br.com.impacta.exercicios.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.exercicios.classes.Endereco;
import br.com.impacta.exercicios.classes.Imovel;
import br.com.impacta.exercicios.classes.Proprietario;

public class AplicacaoImovel {
	public static void main(String[] args) {
		Proprietario prop = new Proprietario();
		prop.setNome("Rennan");
		prop.setTelefone("3254-2200");
		
		Endereco end = new Endereco();
		end.setLogradouro("Rua Augusta");
		end.setNumero(600);
		end.setCidade("São Paulo");
		
		Imovel imovel = new Imovel();
		imovel.setArea(120);
		imovel.setNumComodos(7);
		imovel.setEndereco(end);
		imovel.setProprietario(prop);
		
		JOptionPane.showMessageDialog(null, imovel.getDados());
		
	}
}
