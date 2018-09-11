package br.edu.ifsp.spo.lg2a2.sge.repositories;

import java.util.ArrayList;
import java.util.Collection;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;

public class AlunosRepository {
        private AlunosRepository repositorio;
        
	private static Collection<Aluno> alunos = new ArrayList<Aluno>();

	public AlunosRepository() {
            Collection<Aluno> alunosMock = new ArrayList<Aluno>();
                alunosMock.add(new Aluno("SP3009122","27237335480","Gustavo Pereira Barbosa", "guga.72@hotmail.com") );
            repositorio = new AlunosRepository(alunosMock);
	}
	
	public AlunosRepository(Collection<Aluno> alunos) {
		this.alunos.addAll(alunos);
	}

	
	public Aluno buscarPorCpf(String cpf) {		
		Aluno resultado = null;
		
		for(Aluno aluno : AlunosRepository.alunos) {
			if(aluno.getCpf().equals(cpf)) {
				resultado = aluno;
				break;
			}
		}
		
		return resultado;
	}
	
	public void adicionar(Aluno aluno) {
           
	}
	
	public void remover(Aluno aluno) {
		AlunosRepository.alunos.remove(aluno);
	}
}
