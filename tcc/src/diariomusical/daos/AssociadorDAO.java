package diariomusical.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import diariomusical.models.musica;

public class AssociadorDAO {
	//sandy do futuro, isso daqui pegar músicas de uma playlist  

	private Connection connection;

	public AssociadorDAO() {
		connection = ConnectionFactory.getConnection();
	}


	public List<Musicas> getLista(String PlaylistID) {
		List<Musicas> result = new ArrayList<>();

		try {
			PreparedStatement stmt = this.connection.prepareStatement("select * from musicas where playlist_id = ?;");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto musica
				musica m  = new Musica();
				musica.setNome(rs.getString("nome"));
				musica.setLink(rs.getString("link"));

			

				// adicionando o objeto ï¿½ lista
				result.add(musica);
			}
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	

	
	
	

}
