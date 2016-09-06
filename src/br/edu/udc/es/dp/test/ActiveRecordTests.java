package br.edu.udc.es.dp.test;

import java.util.Calendar;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.udc.es.dp.activerecord.AbstractEntity;
import br.edu.udc.es.dp.activerecord.Pessoa;

public class ActiveRecordTests {
	
	@Before
	public void before() {
		Pessoa.clear();
	}
	
	@Test
	public void saveTest() {
		final Pessoa pessoa = new Pessoa();
		pessoa.setEmail("eu@email.com");
		pessoa.setNascimento( Calendar.getInstance() );
		pessoa.setNome("Eu");
		pessoa.save();
		
		Assert.assertNotNull( pessoa.getId() );
		Assert.assertEquals( 1, Pessoa.all().size() );
	}
	
	@Test
	public void removeTest() {
		final Pessoa pessoa = new Pessoa();
		pessoa.setEmail("meu@email.com");
		pessoa.save();
		pessoa.remove();
		
		Assert.assertEquals( 0, Pessoa.all().size() );
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void removeDeveFalhar(){
		final Pessoa pessoa = new Pessoa();
		pessoa.remove();
		Assert.fail("Deveria falhar a remoção");
	}
	
	@Test
	public void findById(){
		final Pessoa pessoa = new Pessoa();
		pessoa.save();
		
		final Pessoa pessoaEncontrada = (Pessoa) Pessoa.findById( pessoa.getId() ); 
		Assert.assertEquals(pessoa, pessoaEncontrada);
	}
	
	@Test
	public void whereDevePassar() {
		final Collection<AbstractEntity> pessoas = 
				Pessoa.where("email", "meu@email.com")
					.and("nome", "Maria")
					.and("nascimento", "now()")
					.list();
		
		Assert.assertTrue( pessoas.isEmpty() );
	}
}
