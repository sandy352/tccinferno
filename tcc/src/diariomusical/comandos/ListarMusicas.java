package diariomusical.comandos;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import diariomusical.daos.ContatoDAO;
import diariomusical.models.Contato;

public class ListarMusicas implements Comando {

	public String executa(HttpServletRequest request, HttpServletResponse response) {
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.getLista();
		
		
		
		//request.setAttribute("contatos", contatos);
		
		return "lista.jsp";
		
	}

}
