package br.com.felipe.testeFinal.teste;

import br.com.felipe.testeFinal.dao.UsuarioDAO;
import br.com.felipe.testeFinal.model.Usuario;

public class Teste {

	Usuario usuario = new UsuarioDAO.login("fulano", "senha123");
	if(usuario==null){
	    System.out.println("Não existe ou dados incorretos");
	}
	
}
