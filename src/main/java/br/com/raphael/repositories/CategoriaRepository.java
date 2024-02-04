package br.com.raphael.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.raphael.entities.Categoria;
import br.com.raphael.factories.ConnectionFactory;

public class CategoriaRepository {

	public List<Categoria> findAll()throws Exception{
		
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement
				("select * from categoria order by nome");
		
		ResultSet resultSet = statement.executeQuery();
		
		List<Categoria> lista = new ArrayList<Categoria>();
		
		while (resultSet.next()) {
			
			Categoria categoria = new Categoria();
			
			
			categoria.setId(UUID.fromString(resultSet.getString("id")));
			categoria.setNome(resultSet.getString("nome"));
			
			lista.add(categoria);
			
		}
		
		connection.close();
		return lista;
				
	}
	
	public Categoria findById(UUID id)throws Exception{
		
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement
				("select * from categoria where id=?");
		
		statement.setObject(1, id);
		ResultSet resultSet = statement.executeQuery();
		
		Categoria categoria = null;
		
		if (resultSet.next()) {
			
			categoria = new Categoria();
			
			categoria.setId(UUID.fromString(resultSet.getString("id")));
			categoria.setNome(resultSet.getString("nome"));
						
		}		
		
		connection.close();
				
		return categoria;
			
	}
}
