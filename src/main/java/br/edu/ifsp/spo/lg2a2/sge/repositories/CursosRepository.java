package br.edu.ifsp.spo.lg2a2.sge.repositories;

import java.util.ArrayList;
import java.util.Collection;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;

public class CursosRepository {
        private CursosRepository repository;

        private static Collection<Curso> cursos = new ArrayList<Curso>();
        
        
    public void adicionarCurso(Curso curso) {
    	this.cursos.add(curso);
    }
    
    public void Curso(String curso) {
    	for(Curso curso : CursosRepository.cursos) {
    		
    	}
//    	for(Aluno aluno : AlunosRepository.alunos) {
//			if(aluno.getCpf().equals(cpf)) {
//				resultado = aluno;
//				break;
//			}
//		}
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
