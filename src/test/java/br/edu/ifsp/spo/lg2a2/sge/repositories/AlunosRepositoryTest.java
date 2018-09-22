package br.edu.ifsp.spo.lg2a2.sge.repositories;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;

public class AlunosRepositoryTest {
	
	private AlunosRepository repository;
	
	@Before
	public void setUp() {
		Collection<Aluno> alunosMock = new ArrayList<Aluno>();
		alunosMock.add(
				new Aluno("sp300001", "23103213387", "Jo�o da Silva", "joao_silva@example.org"));
		alunosMock.add(
				new Aluno("sp300002", "04388567833", "Maria da Silva", "maria_silva@example.org"));
		alunosMock.add(
				new Aluno("sp300003", "58466782540", "Joana da Silva", "joana_silva@example.org"));
		
		repository = new AlunosRepository(alunosMock);
	}
	
	@Test
	public void buscarPorCpfExistenteTest() {
		//1. Configura��o
		
		String cpf = "04388567833";
		
		//2. Execu��o
		Aluno aluno = repository.buscarPorCpf(cpf);
		
		//3. Asser��o / Verifica��o
		Assert.assertNotNull(aluno);
	}
	
	@Test
	public void buscarPorCpfInexistenteTest() {
		//1. Configura��o
		String cpf = "16148794861";
		
		//2. Execu��o
		Aluno aluno = repository.buscarPorCpf(cpf);
		
		//3. Asser��o / Verifica��o
		Assert.assertNull(aluno);
	}
	
	@Test
	public void adicionarAlunoTest() {
		//1. Configura��o
		String cpf = "27237335480";
		Aluno alunoASerAdicionado = new Aluno("SP220000", cpf, "Jo�o da Silva", "joao@example.com");
		//2. Execu��o
		repository.adicionar(alunoASerAdicionado);
		
		//3. Asser��o / Verifica��o
		Aluno aluno = repository.buscarPorCpf(cpf);
		Assert.assertNotNull(aluno); 
	}
	
	@Test
	public void removerAlunoTest() {
		//1. Configura��o
		String cpf = "58466782540";
		Aluno aluno = new Aluno("sp300003", cpf, "Joana da Silva", "joana_silva@example.org");
		//2. Execu��o
		repository.remover(aluno);
		//3. Valida��o
		Assert.assertNull(repository.buscarPorCpf(cpf));
	}

}
