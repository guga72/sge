package br.edu.ifsp.spo.lg2a2.sge;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.SituacaoMatricula;
import br.edu.ifsp.spo.lg2a2.sge.repositories.AlunosRepository;
import br.edu.ifsp.spo.lg2a2.sge.repositories.CursosRepository;
import br.edu.ifsp.spo.lg2a2.sge.vo.ComprovanteMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.DadosAluno;
import java.util.Collection;

import java.util.Scanner; 

//class Pessoa {
//	private static int quantidadeInstancias;
//	public static int getQuantidadeInstancias() {
//		return quantidadeInstancias;
//	}
//	
//	private String nome;
//	public String getNome() {
//		return this.nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	
//	public Pessoa() {
//		Pessoa.quantidadeInstancias++;
//	}
//}

public class App {

	public static void main(String[] args) {
		
		CursosRepository ADS = new CursosRepository();
		
		String nome;
		String email;
		String cpf;
		int prontuario = 300000000;
		String curso;
		
		Scanner scan = new Scanner(System.in);
		for (;;){
		System.out.print("Digite o CPF: ");
		cpf = scan.next();
		SituacaoMatricula resultado = ProcessoDeMatricula.verificarExistenciaAluno(cpf);
		if (resultado == SituacaoMatricula.Cadastrado){
			System.out.println ("CPF j� cadastrado! ");
		
		}
		if (resultado == SituacaoMatricula.Novo){
			System.out.println ("CPF n�o cadastrado! ");
			System.out.print ("Nome: ");
			nome = scan.next(); 
			System.out.print ("E-mail: ");
			email = scan.next();
			System.out.print("Qual curso vai se matricular:");
			curso = scan.next();
			DadosAluno dados = new DadosAluno(cpf, nome, email);
			ComprovanteMatricula comprovante = ProcessoDeMatricula.processarMatricula(dados, prontuario, curso);
			prontuario++;
		}
		}
		
		
		
//		Aluno andrey = new Aluno("SP3013049", "567894523-50", "Andrey Camargo Lacerda", "andrey-lacerda@hotmail.com");
//		Curso ads = new Curso("ads", "8588756456");
		
		// TODO Auto-generated method stub		
		
//		Pessoa joao = new Pessoa();
//		joao.setNome("Jo�o");
//		
//		System.out.println(Pessoa.getQuantidadeInstancias());
//		System.out.println(joao.getNome());
//		
//		Pessoa maria = new Pessoa();
//		maria.setNome("Maria");
//		System.out.println(Pessoa.getQuantidadeInstancias());
//		System.out.println(maria.getNome());
	}

}
