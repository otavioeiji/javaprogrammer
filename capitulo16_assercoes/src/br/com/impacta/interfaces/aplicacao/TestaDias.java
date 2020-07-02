package br.com.impacta.interfaces.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.interfaces.Dias;
import br.com.impacta.utilitarios.Utilitarios;

public class TestaDias {
	public static void main(String[] args) {
		//int calcular(int d, int m, int a);
		try{
			Dias dias = Utilitarios::calcularDias;
			
			int restantes = dias.calcular(19, 7, 2015);
			System.out.println("Restam " + restantes);
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
	}
}
