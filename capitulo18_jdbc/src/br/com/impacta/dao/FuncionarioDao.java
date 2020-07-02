package br.com.impacta.dao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Funcionario;

public class FuncionarioDao extends Dao {

	//método para incluir um novo funcionario
	public void incluirFuncionario(Funcionario fn, String cnpj) throws Exception{
		try {
			abrirConexao();
			


			// Instrução SQL para incluir um novo funcionario
			String sql = "INSERT INTO FUNCIONARIO (REGISTRO, NOME, IDADE,"
					+ " SEXO,CARGO,SALARIO,CNPJ) VALUES (?,?,?,?,?,?,?)";

			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, fn.getRegistro());
			stmt.setString(2, fn.getNome());
			stmt.setInt(3, fn.getIdade());
			stmt.setInt(4, fn.getSexo().ordinal());
			stmt.setString(5, fn.getCargo());
			stmt.setDouble(6, fn.getSalario());
			stmt.setString(7, cnpj);

			stmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
	}
}
