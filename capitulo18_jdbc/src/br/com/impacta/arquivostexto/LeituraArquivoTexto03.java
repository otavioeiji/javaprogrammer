package br.com.impacta.arquivostexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import br.com.impacta.classes.Endereco;

public class LeituraArquivoTexto03 {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			JFileChooser chooser = new JFileChooser();
			List<Endereco> enderecos = new ArrayList<Endereco>();
			
			if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

				FileReader arquivo = new FileReader(
									 chooser.getSelectedFile());
				BufferedReader buffer = new BufferedReader(arquivo);
				
				while (true) {
					String linha = buffer.readLine();
					if(linha == null || linha.trim().equals("")){
						break;
					}
						
					//quebramos a linha através do ;
					String[] itens = linha.split(";");
					Endereco end = new Endereco(itens[0]);
					//end.setLogradouro(itens[0]);
					end.setNumero(Integer.parseInt(itens[1]));
					end.setCidade(itens[2]);
					 
					enderecos.add(end);					
				}
				enderecos.forEach(s -> 
					{
						System.out.println(s.getDados());
						System.out.println("--------------");
					});
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}
}
