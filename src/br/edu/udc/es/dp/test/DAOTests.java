package br.edu.udc.es.dp.test;

import org.junit.Assert;
import org.junit.Test;

import br.edu.udc.es.dp.dao.Usuario;
import br.edu.udc.es.dp.dao.UsuarioDAO;

public class DAOTests {
	
	@Test
	public void insertDevePassar()
	{
		final UsuarioDAO dao = new UsuarioDAO();
		
		Usuario maria = new Usuario();
		maria.setEmail("email@da.maria.com");
		maria.setNome("MAria cristina");
		maria.setSenha("Minha senha secreta xxx");
		maria.setID(1L);
		
		maria = dao.insert(maria);
		Assert.assertNotNull(maria);
		System.out.println( maria );
		
		Assert.assertEquals(1, dao.listAll().size());
	}
}
