package br.edu.ifsp.spo.lg2a2.sge.repositories;

import java.util.Collection;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;
import java.util.ArrayList;

public class CursosRepository {
            private CursosRepository crepositorio;
            private static Collection<Curso> curso = new ArrayList<Curso>();
        public CursosRepository() {
            Collection<Curso> cursosMock = new ArrayList<Curso>();
                cursosMock.add(new Curso("Analise e Desenvolvimento de Sistemas"));
            crepositorio = new CursosRepository(cursosMock);
}

    private CursosRepository(Collection<Curso> cursoMock) {
        this.curso.addAll(curso);
    }
	public Curso buscarPorCodigo(String codigo) {
		return null;
	}
	
	public Collection<Turma> buscarTurmas(String codigoCurso){
		return null;
	}
	
	public Collection<Aluno> buscarAlunos(String codigoCurso){
		return null;
	}
	
	public boolean existeAlunoNoCurso(String cpf) {
		return false;
	}
	
	public void adicionarAluno(Aluno aluno) {
	}
}
