package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Curso {
    private String curso;
	
    public String getCurso() {
		return curso;
	}
	private Collection<Turma> turmas;

    public Curso(String curso) {
        this.curso = curso;
    }
	public Collection<Turma> getTurmas() {
		return this.turmas;
	}

}
