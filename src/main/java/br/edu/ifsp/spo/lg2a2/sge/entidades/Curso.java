package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Curso {
	
	
	private String nome;
	private String codigo;
	
	public Curso(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public Curso(String ncurso) {
		this.nome = ncurso;
		
	}

	private Collection<Turma> turmas;
        
	public Collection<Turma> getTurmas() {
		return this.turmas;
	}

}
