package br.com.impacta.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.classes.Empresa;

public class EmpresaDao extends Dao {

	//método para incluir uma nova empresa
	public void incluirEmpresa(Empresa empresa) throws Exception {
		try {
			abrirConexao();
			stmt = cn.prepareStatement("INSERT INTO EMPRESA "
					+ "(CNPJ,DESCRICAO) VALUES (?,?)");
			stmt.setString(1, empresa.getCnpj());
			stmt.setString(2, empresa.getDescricao());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
	}
	
	//Método para retornar uma lista de empresas
	public List<Empresa> listarEmpresas() throws Exception{
		List<Empresa> empresas = new ArrayList<Empresa>();
		try {
			abrirConexao();
			stmt = cn.prepareStatement("SELECT * FROM EMPRESA");
			rs = stmt.executeQuery();
			while(rs.next()){
				Empresa e = new Empresa(rs.getString("CNPJ"), 
						                rs.getString("DESCRICAO"));
				empresas.add(e);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		return empresas;
	}
}







