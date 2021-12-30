package CursoJavaExecutavel;

import javax.swing.JOptionPane;

import CursoJava.Classes.Aluno;

public class PrimeiraClasseJava {

	/* Main é um metodo executavel em Java */
	public static void main(String[] args) {
		
		
         /*New Aluno() é uma instancia (criação de Objeto)*/
		/*Aluno1 é um referencia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data Nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da Mãe?");
		String pai = JOptionPane.showInputDialog("Nome Pai");
		String matricula = JOptionPane.showInputDialog("Qual é a Matricula?");
		String escola = JOptionPane.showInputDialog("Nome Escola?");
		String serie = JOptionPane.showInputDialog("Qual a série");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		Aluno aluno1 = new Aluno();/*Aqui será o joão*/
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Rg = " + aluno1.getRegistroGeral());
		System.out.println("Cpf = " + aluno1.getNumeroCpf());
		System.out.println("Nome mãe = " + aluno1.getNomeMae());
		System.out.println("Nome pai = " + aluno1.getNomePai());
		System.out.println("Matricula = " + aluno1.getDataMatricula());
		System.out.println("Nome Escola = " + aluno1.getNomeEscola());
		System.out.println("Série Matriculado = " + aluno1.getSerieMatriculado());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2()); 
        
		
		/*========================================================================*/
		System.out.println("-----------------------------------------------------------");
		
		Aluno aluno2 = new Aluno();/*Aqui será o pedro*/
		
		aluno2.setNome("Pedro");
		aluno2.setIdade(40);
		aluno2.setDataNascimento("10/12/7980");
		
		
		System.out.println("Nome é = " + aluno2.getNome());
		System.out.println("Idade é = " + aluno2.getIdade());
		System.out.println("Nascimento = " + aluno2.getDataNascimento());
		System.out.println("Média da nota é = " + aluno2.getMediaNota());
		/*========================================================================*/
		Aluno aluno3 = new Aluno();/*Aqui será o Samuel*/
		
		Aluno aluno4 = new Aluno("Maria"); 
	
		Aluno aluno5 = new Aluno("José", 50); 
		
	
	}
	
	
	
	
}
		
			
		
			
   
     
	


