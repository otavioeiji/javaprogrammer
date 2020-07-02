package br.com.impacta.jdbc.aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class CadastroFuncionario {
	public static void main(String[] args) {

		Connection cn; // mantém a conexão com o banco de dados
		PreparedStatement stmt; // executa tarefas sobre o bco. dados
		ResultSet rs;
		
		String url = "jdbc:mysql://localhost:3306/cadastro";

		try {
			// definindo o driver de acesso
			Class.forName("com.mysql.jdbc.Driver");

			// abrindo a conexão com o banco de dados
			cn = DriverManager.getConnection(url, "root", "Imp@ct@");

			// JOptionPane.showMessageDialog(null, "Conexão OK");

			String opcao = (String) JOptionPane.showInputDialog(null,
					"Escolha uma opção:", "Opções",
					JOptionPane.INFORMATION_MESSAGE, null, new String[] {
							"Incluir", "Listar", "Buscar" }, "Listar");

			if (opcao.equals("Incluir")) {

				int registro = Integer.parseInt(JOptionPane
						.showInputDialog("Informe o registro:"));
				String nome = JOptionPane.showInputDialog("Informe o nome:");
				int idade = Integer.parseInt(JOptionPane
						.showInputDialog("Informe a idade:"));

				String s = (String) JOptionPane.showInputDialog(null,
						"Informe o sexo", "Sexo",
						JOptionPane.INFORMATION_MESSAGE, null, new String[] {
								"Masc", "Fem" }, "Masc");
				int sexo = (s.equals("Masc") ? 0 : 1);

				String cargo = JOptionPane.showInputDialog("Informe o cargo");
				double salario = Double.parseDouble(JOptionPane
						.showInputDialog("Informe o salário"));

				// Instrução SQL para incluir um novo funcionario
				String sql = "INSERT INTO FUNCIONARIO (REGISTRO, NOME, IDADE,"
						+ " SEXO,CARGO,SALARIO) VALUES (?,?,?,?,?,?)";

				stmt = cn.prepareStatement(sql);
				stmt.setInt(1, registro);
				stmt.setString(2, nome);
				stmt.setInt(3, idade);
				stmt.setInt(4, sexo);
				stmt.setString(5, cargo);
				stmt.setDouble(6, salario);

				stmt.executeUpdate();
				JOptionPane.showMessageDialog(null, "Funcionario incluído");
			}
			else if(opcao.equals("Listar")){
				//Realizar uma consulta a todos os funcionarios
				stmt = cn.prepareStatement("SELECT * FROM FUNCIONARIO");
				rs = stmt.executeQuery();
				
				while(rs.next()){
					System.out.println("Registro: " + rs.getInt("REGISTRO"));
					System.out.println("Nome: " + rs.getString("NOME"));
					System.out.println("Idade: " + rs.getInt("IDADE"));
					System.out.println("Sexo: " + (rs.getInt("SEXO")==0?"Masc.":"Fem."));
					System.out.println("Cargo: " + rs.getString("CARGO"));
					System.out.println("Salário: " + rs.getDouble("SALARIO"));
					System.out.println("---------------------------");
				}
			}
			else {
				
			}
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
}
