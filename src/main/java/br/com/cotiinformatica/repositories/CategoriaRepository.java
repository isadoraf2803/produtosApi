package br.com.cotiinformatica.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.entities.Categoria;
import br.com.cotiinformatica.factories.ConnectionFectory;

public class CategoriaRepository {
	public List<Categoria> findAll() throws Exception {

		var connection = ConnectionFectory.getConnection();

		var query = "SELECT * FROM categoria ORDER BY nome ASC";

		var statement = connection.prepareStatement(query);
		var result = statement.executeQuery();

		var lista = new ArrayList<Categoria>();

		while (result.next()) {
			var categoria = new Categoria();
			categoria.setId(UUID.fromString(result.getString("id")));
			categoria.setNome(result.getString("nome"));

			lista.add(categoria);

		}

		connection.close();

		return lista; // TODO

	}

}
